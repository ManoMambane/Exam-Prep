package mano.learnprogramming;

public class MainMethod {

    public static void main(String[] args) {
        System.out.println("Args size = " + args.length);

        for(int i=0; i < args.length; i++){
            System.out.println("Args [" + i + "]=" + args[i]);
        }
    }
}
