package DecimalNumericPrimitives;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        //float
        //use 'F' to specify a float
        float myNumber = 25.4F;

        //double before = 10_.25; //does not compile
        //double before = 10._25; //does not compile
        //double first = _10.25; //does not compile
        //double last = 10.25_; //does not compile

        double myDouble = 2.54;
        double myDouble2 = 2.54F;
        double anotherDouble = 2.45d; // 'd' can be used for double

        double scientific = 5.000125E03;
        double scientific2 = 5.000125E3;
        double myDouble3 = 5000.125;

        System.out.println("scientific = " + scientific);
        System.out.println("scientific2 = " + scientific2);
        System.out.println("myDouble3 = " + myDouble3);

        double hexPi = 0x1.91eb851eb851fp1;
        System.out.println("hexiPi = " + hexPi);
    }
}
