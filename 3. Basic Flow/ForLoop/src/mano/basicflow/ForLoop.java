package mano.basicflow;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.print(i+" ");
        }
        System.out.println(); //new line
        int a;
        for (a = 0; a <10; a++){
            System.out.print(a+" ");
        }
        System.out.println(); //new line;
        System.out.println("after forloop a= "+a);

        /** infinite for loop
         *
         * for(;;) {
         *  System.out.println("Hello");
         */

        int x = 0;
        for(int y=0, z=4; x<5 && y < 10; x++, y++){
            System.out.println("y= "+y);
        }
        System.out.println("x= "+x);

        int d =10;
//        for (int e=0, d=0; e>10 || d < 10; e++, d--){
//            can not complile
//        }

//        for (long z= 0, int d = 4; z < 10; z++, d++){}

        for (long z = 0; z < 10; z++){
            System.out.println("z= "+z);
        }
        for(double xy = 0.00; xy < 10.5; xy += 0.5){
            System.out.println("xy= "+xy);
        };
    }
}
