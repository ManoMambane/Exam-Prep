package WholeNumericPrimitives;

public class WholeNumericPrimitives {

    public static void main(String[] args) {

        long max = 32_123_456_789L; // 'L' representing a Long
        long n = 2_300;

        // octal from (0-7)
        int oct = 07;
        int firstOct = 010; // 8 decimal
        int secondOct = 022; //18 decimal
        int sumOct = firstOct + secondOct;
        System.out.println("first = " + firstOct + " second = " + secondOct); //26 decimal, 32 oct
        System.out.println("decimal sum = " + sumOct + " octSum = " + Integer.toOctalString(sumOct));

        //hexodecimal (0-9) and (A-F)
        int firstHex = 0xF; //15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; //first = 45, second = 2d
        System.out.println("first = " + firstHex + " second = " + secondHex); //26 decimal, 32 oct
        System.out.println("decimal sum = " + sumHex + " hexSum = " + Integer.toHexString(sumHex));

        //binary
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; //7 decimal
        int sumBin = firstBin + secondBin;
        System.out.println("first = " + firstBin + " second = " + secondBin); //9 decimal, 7 decimal
        System.out.println("decimal sum = " + sumBin + " binSum = " + Integer.toBinaryString(sumBin)); // sum = 16 decimal, binSum = 10000

    }
}
