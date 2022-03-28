package com.mano;

public class Main {

    /**
     * Main method
     *
     * @param args command line
     *
     * This is a JavaDoc Comment
     */

    public static void main(String[] args) {
        //This is a Line Comment.

            System.out.println("Args size = " + args.length);

            /*
            this
            is a
            multiline
            comment
             */

            for(int i=0; i < args.length; i++){
                System.out.println("Args [" + i + "]=" + args[i]);
            }
        }

    /**
     *Calculate sum of two integers
     *
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum( int a, int b){
        return a+b;
        }
    }

