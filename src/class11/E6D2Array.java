package class11;

public class E6D2Array {
    public static void main(String[] args) {

        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        for (int row = 0; row < arr2D.length; row++) {
            for (int column = 0; column < arr2D[row].length; column++) {
                int element = arr2D[row][column];


                System.out.print(element+" ");

                } System.out.println();
            }

        }
    }



