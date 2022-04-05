package mano.arrays;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
//        int sorting array
        int[] numbers = {10, 6, 8, 3, 18};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        string sorting array
        String[] stringsort = {"Mano", "Nothando", "Miji","Brii", "Ed",};
        Arrays.sort(stringsort);
        System.out.println(Arrays.toString(stringsort));
    }
}
