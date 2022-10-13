package be.intecbrussel.oefeningOOP;

public class Search {

    // Geen properties
    // Werken met de default constructor want ik heb er
    // geen aangemaakt.
    // Geen Getter/ setter want ik heb geen properties

    // Mijn eigen methode
    public int countVowels(String str) {

        int count = 0;

        for (int index = 0; index < str.length(); index++) {

            if (str.charAt(index) == 'a' ||
                    str.charAt(index) == 'e' ||
                    str.charAt(index) == 'i' ||
                    str.charAt(index) == 'o' ||
                    str.charAt(index) == 'u')

            {
                count++;
            }

        }

        return count;

    }

}

