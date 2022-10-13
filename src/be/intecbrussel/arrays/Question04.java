package be.intecbrussel.arrays;

import java.util.Arrays;

public class Question04 {

    public static void main(String[] args) {

        // Schrijf een programma dat de even en oneven nummers optelt van een int array.

        int[] arrayNums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(arrayNums));

        int counter = 0;

        for (int index = 0; index < arrayNums.length; index++) {

            if (arrayNums[index] % 2 == 0)
                counter++;

        }

        System.out.println("Number of even numbers : " + counter);
        System.out.println("Number of odd numbers  : " + (arrayNums.length - counter));

    }

}
