package be.intecbrussel.arrays;

public class Question03 {

    public static void main(String[] args) {

        // Schrijf een programma dat de duplicaten vindt in een array int values.

        int[] myArr = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int indexOuter = 0; indexOuter < myArr.length - 1; indexOuter++) {

            for (int indexInner = indexOuter + 1; indexInner < myArr.length; indexInner++) {

                if ((myArr[indexOuter] == myArr[indexInner]) && (indexOuter != indexInner)) {
                    System.out.println("Duplicate Element : " + myArr[indexInner]);
                }

            }

        }

    }

}
