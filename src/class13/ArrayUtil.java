package class13;

import org.jetbrains.annotations.NotNull;

public class ArrayUtil {
    public static void main(String @NotNull [] args) {
        int[] arry = {10, 20, 45, 89};
        int[] arry1 = {12, 32, 455, 889,10};
        int[] arry2 = {120, 302, 5, 889,100};
        int number = 89;
        int number1 = 10;
        int number2 = 10;

        ArrayUtil ivana=new ArrayUtil();
        ivana.searchArry(arry,number);
        ivana.searchArry(arry1,number1);
        ivana.searchArry(arry,number2);

    }

    void searchArry(int[] arry, int number) {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == number) {
                System.out.println("Yes");
                break;
            }


        }
    }
}