package class11;

public class E67D2Array {
    public static void main(String[] args) {

        boolean[][] arr2D = {{true, false, true, true, false},
                {true, false, false, false, false},

        };
        int counter = 0;

        for (boolean[] arr1D : arr2D) {
            for (boolean bool : arr1D) {
                if (bool) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}




