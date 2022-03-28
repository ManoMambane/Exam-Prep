package mano.strings;

import java.util.Locale;

public class StringImmutability {

    public static void main(String[] args) {
        //String cannot be changed

        String hello = "hello";
        String hi = hello + "world"; //not existing code
        hi = hello;//hello

        System.out.println(hi + hello); //hellohello

        hello = hello.toUpperCase();//to uppercase, new string is created
        System.out.println(hello);

        //String Concat
        String s1 = "1";
        String s2 = s1.concat("2");//"12"
        s2.concat("3");
        System.out.println(s1);//"1"
        System.out.println(s2);//"12"
    }
}
