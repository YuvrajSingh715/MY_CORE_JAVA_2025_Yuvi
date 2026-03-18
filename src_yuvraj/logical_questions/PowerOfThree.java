package logical_questions;

public class PowerOfThree {

    public static void main(String[] args) {

        int n = 81;

        while(n % 3 == 0)
            n /= 3;

        if(n == 1)
            System.out.println("Power of 3");
        else
            System.out.println("Not Power of 3");
    }
}
