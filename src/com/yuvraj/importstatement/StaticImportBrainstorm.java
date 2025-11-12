package com.yuvraj.importstatement;
import static java.lang.Math.*;   // static import of ALL Math members

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * A complex demo that exercises many Math methods and shows
 * statistics, vector ops, transformations, and edge-case behaviour.
 */
public class StaticImportBrainstorm {

    private static final Random RNG = new Random(***REMOVED***); // deterministic for reproducible results

    public static void main(String[] args) {
        double[] values = generateRandomArray(12, -50.0, 150.0);

        System.out.println("input values: " + Arrays.toString(values));
        Stats s = computeStats(values);
        System.out.println("\n== Basic stats ==");
        System.out.printf("count=%d, min=%.6f, max=%.6f, mean=%.6f, stddev=%.6f%n",
                s.count, s.min, s.max, s.mean, s.stddev);

        System.out.println("\n== Transformations ==");
        double[] normalized = zNormalize(values, s.mean, s.stddev);
        System.out.println("z-normalized: " + Arrays.toString(roundArray(normalized, 4)));

        double[] nonLinear = applyComplexTransform(values);
        System.out.println("\ncomplex transform (pow/sin/exp/log/hypot): " + Arrays.toString(roundArray(nonLinear, 4)));

        System.out.println("\n== Vector & Angle demo ==");
        double[] a = {3, 4, 0.5};
        double[] b = {7, -1, 2};
        System.out.println("vector a: " + Arrays.toString(a));
        System.out.println("vector b: " + Arrays.toString(b));
        System.out.printf("||a|| = %.6f, ||b|| = %.6f%n", vecMag(a), vecMag(b));
        System.out.printf("dot = %.6f, angle (rad) = %.6f, angle (deg) = %.6f%n",
                dot(a, b), angleBetween(a, b), toDegrees(angleBetween(a, b)));

        System.out.println("\n== Edge cases and Math curiosities ==");
        edgeCaseExploration();

        System.out.println("\n== Random sampling (min, max via Math.hypot) ==");
        sampleHypotDemo();

        System.out.println("\nDone.");
    }

    // --- utilities ---

    // generate n doubles in [low, high)
    static double[] generateRandomArray(int n, double low, double high) {
        return DoubleStream.generate(() -> low + RNG.nextDouble() * (high - low))
                .limit(n)
                .toArray();
    }

    // compute simple stats (population stddev)
    static Stats computeStats(double[] arr) {
        int n = arr.length;
        if (n == 0) return new Stats(0, Double.NaN, Double.NaN, Double.NaN, Double.NaN);
        double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY, sum = 0.0;
        for (double v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
            sum += v;
        }
        double mean = sum / n;
        double var = 0.0;
        for (double v : arr) {
            double d = v - mean;
            var += d * d;
        }
        double stddev = sqrt(var / n);
        return new Stats(n, min, max, mean, stddev);
    }

    // z-normalize (zero mean, unit variance) guard against zero stddev
    static double[] zNormalize(double[] arr, double mean, double stddev) {
        double eps = 1e-12;
        double denom = (abs(stddev) < eps) ? 1.0 : stddev;
        return Arrays.stream(arr).map(x -> (x - mean) / denom).toArray();
    }

    // apply a fancy compositional transform combining many Math ops
    static double[] applyComplexTransform(double[] arr) {
        return Arrays.stream(arr).map(x -> {
            // safe log: shift to positive domain
            double shifted = x + 60; // attempt to make it > 0
            double safeLog = (shifted > 1e-12) ? log(shifted) : Double.NaN;

            // combine trig, power, and exp; clamp and use hypot to avoid overflow where possible
            double part1 = pow(abs(x), 1.5) * sin(x / 10.0);
            double part2 = exp(min(5.0, x / 50.0)); // cap exponent growth
            double part3 = (Double.isFinite(safeLog) ? safeLog : 0.0);

            // use hypot to combine robustly: hypot(part1, part2) then add part3
            double combined = hypot(part1, part2) + part3;

            // squish with atan to keep values bounded, then scale back
            double bounded = tanhLike(combined) * 100.0;

            // occasionally introduce nextAfter to show tiny increments
            return nextAfter(bounded, combined);
        }).toArray();
    }

    // small helper approximating tanh using Math.tanh if available; else fallback:
    static double tanhLike(double x) {
        return tanh(x); // Math.tanh exists and is statically imported
    }

    // round array values for nicer printing
    static double[] roundArray(double[] arr, int decimals) {
        double scale = pow(10, decimals);
        return Arrays.stream(arr).map(v -> floor(v * scale + 0.5) / scale).toArray();
    }

    // vector magnitude (Euclidean)
    static double vecMag(double[] v) {
        double sum = 0.0;
        for (double x : v) sum += x * x;
        return sqrt(sum);    // could also use hypot in a loop, but sqrt(sum) is fine for few dims
    }

    static double dot(double[] a, double[] b) {
        int n = Math.min(a.length, b.length);
        double s = 0.0;
        for (int i = 0; i < n; i++) s += a[i] * b[i];
        return s;
    }

    static double angleBetween(double[] a, double[] b) {
        double denom = vecMag(a) * vecMag(b);
        if (denom == 0.0) return 0.0;
        double cosT = dot(a, b) / denom;
        // clamp small rounding errors
        cosT = min(1.0, max(-1.0, cosT));
        return acos(cosT);
    }

    // demonstrate several Math edge-cases
    static void edgeCaseExploration() {
        System.out.println("sqrt(-1) => " + sqrt(-1));               // NaN
        System.out.println("log(0) => " + log(0));                 // -Infinity
        System.out.println("exp(709) => (near Double.MAX) => " + exp(709)); // large but finite
        System.out.println("exp(1000) => " + exp(1000));          // +Infinity (overflow)
        System.out.println("floor(3.7) => " + floor(3.7));
        System.out.println("ceil(-2.3) => " + ceil(-2.3));
        System.out.println("round(2.5) => " + round(2.5));
        System.out.println("ulp(1.0) => " + ulp(1.0));            // unit in last place
        System.out.println("nextAfter(1.0, 2.0) => " + nextAfter(1.0, 2.0)); // tiny step
        System.out.println("IEEEremainder(5.3, 2.0) => " + IEEEremainder(5.3, 2.0));
        System.out.println("scalb(1.5, 4) => " + scalb(1.5, 4));  // multiply by 2^4
    }

    // small demonstration using hypot as a robust aggregator
    static void sampleHypotDemo() {
        double sampleMin = Double.POSITIVE_INFINITY;
        double sampleMax = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < 6; i++) {
            double x = RNG.nextGaussian() * 10;
            double y = RNG.nextGaussian() * 10;
            double z = RNG.nextGaussian() * 10;
            double mag = hypot(hypot(abs(x), abs(y)), abs(z)); // 3D hypot
            sampleMin = min(sampleMin, mag);
            sampleMax = max(sampleMax, mag);
            System.out.printf("sample %d -> (%.3f, %.3f, %.3f), |v| = %.6f%n", i, x, y, z, mag);
        }
        System.out.printf("sample min=%.6f, max=%.6f%n", sampleMin, sampleMax);
    }

    // tiny numeric container for stats
    static final class Stats {
        final int count;
        final double min, max, mean, stddev;
        Stats(int count, double min, double max, double mean, double stddev) {
            this.count = count;
            this.min = min;
            this.max = max;
            this.mean = mean;
            this.stddev = stddev;
        }
    }
}
