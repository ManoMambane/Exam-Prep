package mano.javabasics;

public class DeclearingAndInitializingVariables {

    public static void main(String[] args) {
        //declaring and initializing in  two lines
        int myNumber; //declaration
        myNumber = 10; //initialization
        System.out.println("myNumber = " + myNumber);

        //declaring and initializing in  one line
        double myDouble = 7.50;
        System.out.println("myDouble = " + myDouble);

        float myFloat1, myFloat2, myFloat3;
        float myFloat4; float myFloat5;
        float myFloat6 = 5f, myFloat7 = 10f, myFloat8;

        boolean b1, b2;

        //double d1,double d2 //does not compile

        int i1;
        int i2;
        //int i3; 14; //does not compile
        //int int = 10; //does not compile

        char cHaR;
        char Char;

        float okFloat;
        double $Ok2Double;
        double _alsoDouble;
        double __OkButNotNice$_123;

        /** examples which do not compile
         *
         * double #point;
         * double my@street;
         * float *$coffee;
         * float double;
         * double public;
         */
    }
}
