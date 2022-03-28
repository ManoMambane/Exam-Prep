package mano.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        /**
         * MATH
         */
        int result = 3 - 2 + 2 * 2 + 3;
        // 3 - 2 + 4 + 3
        // 1 + 7
        // 8
        System.out.println("result " + result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 8 + 10
        // 3 - 2
        // 5
        System.out.println("result " + result);

        int a = 4;
        int b = 3 - 2 * --a; // decrement then use, a = a -1;
        /**
         * 3 - 2 * 3
         * 3 - 6
         * -3
         */
        System.out.println("a = " + a + " b = " + b);

        int c = 4;
        int d = 3 - 2 * c--; // use then decrement, a = a -1;
        /**
         * 3 - 2 * 4
         * 3 - 8
         * -5
         */
        System.out.println("a = " + c + " b = " + d);

        long e = 2;
        long f = 4 + 3 * e++; // use then incrememnt, c = c + 1
        /**
         * 4 + 3 * 2
         * 4 + 6
         * 10
         */
        System.out.println("c = " + e + " d = " + f);

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        System.out.println("result " + result);

        /**
         * Moduclas
         * reminder of
         */

        int i = 10;
        int j = 3;

        int k = i % j; //1

        int l = 10 % 2;

        System.out.println("k = " + k + " l = " + l);

        int x = 12;
        int y = 5;
        int z = 2;

        int m = x / 2 - 10 % (4 + 3) - 2 * x % y - z * 3;
        System.out.println("m = " + m);
    }
}
