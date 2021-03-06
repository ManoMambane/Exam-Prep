package mano.basicflow;

public class DoWhileLoop {

    public static void main(String[] args) {

        int a = 0;

        do {
            a++;
        } while (false);
        System.out.println("a= "+a);

//        doesnt compile
//        while(false){
//        a++;
//        }

        int x = 20;

        while (x > 10) x--;
        System.out.println("x= "+x);

        int x2 = 20;
        do x2--;
        while (x2 > 10);
        System.out.println("x2= "+x2);

        int y = 10;
        int z = 5;
        while (y<20)
            y++;
        z+=2;
        y+=10;
        System.out.println(x+", "+y+", "+z);

        int number = 10;
        while (number>10){
            number--;
        }
        do {
            number--;
            while (number > 5) {
                number -= 2;
            }
        }while (number > 10) ;
            System.out.println("number= " + number);
        }
    }
