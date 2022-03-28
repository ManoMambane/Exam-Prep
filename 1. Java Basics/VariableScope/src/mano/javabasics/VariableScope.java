package mano.javabasics;

public class VariableScope {

    //global variable
    static int myNewInt = 5;

    public static void main(String[] args) {
        //local variable
        int myLocalInt = 10;
        {
            int myOtherInt = 20;
            System.out.println("myOtherInt = " + myOtherInt);


        }
        //System.out.println("myOtherInt = " + myOtherInt);
        System.out.println("myLocalInt = " + myLocalInt);
        System.out.println("myNewInt = " + myNewInt);

        int myOtherInt = 30;
        System.out.println("myOtherInt = " + myOtherInt );
    }

    public static void myMethod(){

    }
}
