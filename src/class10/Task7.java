package class10;

public class Task7 {
    public static void main(String[] args) {
        int[] numbers = {7, 21, 65, 33, 99, 1, 15, 11, -11};

        int maxnum = numbers[7];
        for (int num : numbers) {
            if (num>maxnum){
                maxnum=num;
            }
        }
        System.out.println(maxnum);
    }
}


