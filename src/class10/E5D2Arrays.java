package class10;

public class E5D2Arrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30,40,50},
                {20, 50, 65,20},
                {102, 54, 60},
                {20,55}

        };
        /*int[] arr1 = matrix[0];
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i]+" ");
        }
        System.out.println();
       arr1 = matrix[1];
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i]+" ");
        }
        System.out.println();
      arr1 = matrix[2];
        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i]+" ");
            */
        for (int row = 0; row < numbers.length; row++) {
            //int[] arry = numbers[row];
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + " ");
            }
            System.out.println();
        }
    }
}