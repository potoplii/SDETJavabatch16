package class15;

import java.util.Arrays;

public class E1 {
    // create a method that takes a number as input and creates an array of
    // ints with size give by that number fill the array with some numbers lets
    //say 10 call the method createArray
    int[] createArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = 10;
        }

        return array;
    }

    public static void main(String[] args) {

        E1 obj = new E1();
       int []array= obj.createArray(5);
        //System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]+" ");
        }



    }
}




