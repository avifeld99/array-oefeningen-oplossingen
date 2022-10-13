package be.intecbrussel.oefeningOOP;

import java.util.Scanner;

public class MainApp {
    // Maak 2 klassen aan, een Search klas en een MainApp.
    // Schrijf in de Search klas een methode die al de
    // klinkers telt van de user input.
    // En deze in de MainApp uitprint. (Gebruik een scanner!)

    public static void main(String[] args) {

        Search search = new Search();

        Scanner in = new Scanner(System.in);

        System.out.print("Input the string: ");
        String str = in.nextLine().toLowerCase();

        System.out.print("Number of vowels in the string: " +
                search.countVowels(str)+"\n");

    }

}
