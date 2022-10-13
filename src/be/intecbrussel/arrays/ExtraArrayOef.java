package be.intecbrussel.arrays;

import java.util.Arrays;

public class ExtraArrayOef {

    // 1) Print deze array uit **zonder loop** `int[] intArray = {2,5,46,12,34};`
    //
    // 2) Schrijf een programma om een nummer array en een String array te sorteren en uit te printen.

    public static void main(String[] args) {

        // oefening 01
        int[] myArr = {11, 233, 99, 44, 889};

        System.out.println("Array printed out without a loop" + Arrays.toString(myArr));

        // oefening 02
        System.out.println("Original numeric array : "+ Arrays.toString(myArr));
        Arrays.sort(myArr);
        System.out.println("Sorted numeric array : "+Arrays.toString(myArr));


    }

}
