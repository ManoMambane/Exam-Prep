package mano.arrays;

public class CommonArrayProblems {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 1; i < numbers.length; i++){
            System.out.println(i + " - " + numbers[i]);
        }

        System.out.println();

        for (int i = 1; i <= numbers.length - 1; i++){
            System.out.println(i + " - " + numbers[i]);
        }

        System.out.println();

//        int[20] nums;
        int[] nums = new int[20]; //size only at initialization

//        int ize = numbers.length(); // does not complile, length not a method
        int size = numbers.length;

//        numbers.length = 10; //does not compile can not set length of array, only initialization

    }
}
