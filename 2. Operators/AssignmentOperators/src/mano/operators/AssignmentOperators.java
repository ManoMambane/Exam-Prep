package mano.operators;

public class AssignmentOperators {

    public static void main(String[] args) {

        /**
         * Casting
         */
        /*int x = 1.0;
        short y = 19812345;
        int z = 9f;
        long t = 1923012345678910;
         */

        int x = (int)1.0;
        short y = (short)19812345; //overflow
        int z = (int)9f;
        long t = 1923012345678910L;

        System.out.println(x);
        System.out.println(y); //overflow
        System.out.println(z);
        System.out.println(t);

        //overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

//        myByte = myByte + 1;
        myByte++;

//        mySecondByte = mySecondByte -1;
        mySecondByte--;

        System.out.println("myByte = " + myByte);
        System.out.println("mySecondByte = " + mySecondByte);

        short a = 10;
        short e = 20;
        short c = (short)(a * e);

        System.out.println("c = " + c);
    }
}
