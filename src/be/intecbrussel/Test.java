package be.intecbrussel;

public class Test {

    public static void main(String[] args) {

        // niet gebruikt om een array te veranderen
        // houd geen index bij
        // gaat stap voor stap naar vooruit over de array


        int[] myArr = {10, 20, 30};

//        for(int elements : myArr) {
//
//            elements = elements*3;
//
//            System.out.println(elements);
//        }

        int maxSoFar = 20;

        for(int elements : myArr) {
            if(elements > maxSoFar) {
                maxSoFar = elements;
                System.out.println(maxSoFar);
            }
        }

//        String[] myArrStr = new String[5];
//        myArrStr[0] = "hi";
//        myArrStr[2] = "hallo";
//
//        for(String ele : myArrStr) {
//            System.out.println(ele);
//        }

    }

}
