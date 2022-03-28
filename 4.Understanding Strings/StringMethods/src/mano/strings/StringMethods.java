package mano.strings;

public class StringMethods {

    public static void main(String[] args) {

        //0 1 2 3 4 5 6 7 8 9 10
        //j a v a   i s   f u n
        String str = "java is fun";

        //length
        System.out.println(str.charAt(0));//j
        System.out.println(str.charAt(2));//v
        System.out.println(str.charAt(6));//s
        System.out.println(str.charAt(10));//n
//        System.out.println(str.charAt(60)); // unexpectedError

//        index of
        System.out.println(str.indexOf('a'));//1
        System.out.println(str.indexOf('a',2));//3
        System.out.println(str.indexOf("fun"));//8
        System.out.println(str.indexOf("fun", 10));//-1 // match not found

//        substring
//        str = str.substring(8);
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(4,4)); //empty string
//        System.out.println(str.substring(4,2));// throws StringIdexOutOfBoundsException/ out of range
//        System.out.println(str.substring(8/14));// throws StringIdexOutOfBoundsException/ out of range

        System.out.println("AbCd".toLowerCase());//abcd
        System.out.println(str.toUpperCase());//JAVA IS FUN
        System.out.println(str);//java is fun

        String dog = "Lucky";// Lucky
//        dog.toUpperCase();
        System.out.println(dog);//Lucky
        dog = dog.toUpperCase();
        System.out.println(dog);//LUCKY


    }
}
