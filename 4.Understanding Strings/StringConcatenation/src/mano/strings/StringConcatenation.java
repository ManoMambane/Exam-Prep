package mano.strings;

public class StringConcatenation {

    public static void main(String[] args) {

        String text = "hello";
        String anotherText = new String("hello");

        System.out.println(2 + 3); //5
        System.out.println("a" + "b"); //ab
        System.out.println(1 + 2 + "d");//3d

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);//64

        int number = 10;
        int anotherNUmber = 20;
        System.out.println("result= " + number + anotherNUmber);//1020
        System.out.println("result= " + (number + anotherNUmber));//30

        String str = "";
        for (int i = 0; i < 10; i++){
            str += i + " "; // "" quotes for so=pace between numbers
        }
        System.out.println(str);

        String hello = "hello";
        String world = "world";
        String helloWorld = hello + world;
        //hello + world;//in exam they remove assignment
        System.out.println(hello);
    }
}
