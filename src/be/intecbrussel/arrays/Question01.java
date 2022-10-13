package be.intecbrussel.arrays;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

        // 1) Schrijf een programma dat 10 int's vraagt aan een gebruiker en deze in een array plaatst.
        // Print deze array dan uit op het scherm.

        Scanner scanner = new Scanner(System.in);

        int[] myIntArr = new int[10];

        for (int index = 0; index < myIntArr.length; index++) {

            System.out.println("Print the value of myIntArr[" + index + "]");
            myIntArr[index] = scanner.nextInt();

        }

        for (int index = 0; index < myIntArr.length; index++) {

            System.out.println("The value of myIntArr[" + index + "] is " + myIntArr[index]);

        }

    }

}
