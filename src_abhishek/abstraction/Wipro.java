package abstraction;

import java.util.Arrays;
import java.util.Comparator;

public class Wipro {

    public static void main(String[] args) {
        int[] a = {1, 0, 2, 4, 0, 4, 5, 6, 7};

        Arrays.stream(a)
              .boxed()
              .sorted(Comparator.comparingInt(x -> x == 0 ? 1 : 0))
              .forEach(System.out::print);
    }
}



