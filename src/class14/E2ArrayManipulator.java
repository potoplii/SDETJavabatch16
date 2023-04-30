package class14;

import java.util.Scanner;

public class E2ArrayManipulator {
    //int sumArrayElements(int[] arr){
        /*
        creat a method that will take an int array call it sumArr
        and return the sum of all the elements from that array
        creat the object of the class and call the method.

         */
        /*
        return type int
        name of the method => sumArr
        parameters =>(int [] arr)
        body=>{go throug all the elements of the array add them and return the results}
         */
        int sumArr(int[]arr){
            int sum=0;
            for (int num:arr) { //for(int i=0; i<arr.length; i++)
                                // sum=sum+arr[i];
                sum+=num;
            }
            return sum;
        }

    public static void main(String[] args) {
        E2ArrayManipulator obj=new E2ArrayManipulator();
        int[] array={1,3,7,44,56};
        int result= obj.sumArr(array);

        System.out.println(result);


    }

    }

