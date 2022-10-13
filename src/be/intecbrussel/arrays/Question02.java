package be.intecbrussel.arrays;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {

        // 2) Zorg dat je 10 inputs krijgt van een user en sla deze op in een array.
        // Daarna kopieer je deze elementen in een andere array in reverse order.

        Scanner scanner = new Scanner(System.in);

        int[] array01 = new int[10];
        int[] array02 = new int[10];

        for (int index = 0; index < array01.length; index++) {

            System.out.println("Enter the value of array01[" + index + "]");
            array01[index] = scanner.nextInt();

        }

        int index02 = 0;
        for (int index01 = array02.length - 1; index01 >= 0; index01--) {

            array02[index01] = array01[index02];
            index02++;

        }

        for (int index = 0; index < array02.length; index++) {

            System.out.println("The value of array02[" + index + "] is " + array02[index]);

        }

    }

}
