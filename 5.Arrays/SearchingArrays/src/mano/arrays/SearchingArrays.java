package mano.arrays;

import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {

        int[] numbers = {1,3, 4, 6, 7};
        System.out.println(Arrays.binarySearch(numbers,5));
        System.out.println(Arrays.binarySearch(numbers,7));
        System.out.println(Arrays.binarySearch(numbers,2));
        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers,7));
        System.out.println(Arrays.binarySearch(numbers,5));
    }
}
