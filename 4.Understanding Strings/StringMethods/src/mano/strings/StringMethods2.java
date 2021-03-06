package mano.strings;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str.equals(str2)); //false
        System.out.println(str.equalsIgnoreCase(str2)); //true
        System.out.println("abc".equalsIgnoreCase("ABC"));//true

        //startswith/endswith
        System.out.println(str.startsWith("j"));//true
        System.out.println(str.startsWith(str3));//true
        System.out.println(str.startsWith("J".toLowerCase()));

        System.out.println(str.endsWith("va"));//true

//        contains
        System.out.println(str.contains(str3));//true
        System.out.println(str.contains("av"));//true
        System.out.println("Java".contains("j"));//false

//        replace
        String myString = "Java"+ " " + "is" + " " + "cool";
        System.out.println(myString.replace('a','A'));
        System.out.println(myString.replace(" ", "_"));
        System.out.println(myString.replace("is", "_"));
        System.out.println(myString);

//        trim
        System.out.println("Java".trim());
        System.out.println(" Java is cool ");
        System.out.println(" Java is cool ".trim());
    }
}
