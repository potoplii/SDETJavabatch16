package class22;

public class FindTheNumber {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int target = 6;
        int index = findNumber(numbers, target);
        if (index != -1) {
            System.out.println("The number " + target + " is found at index " + index);
        } else {
            System.out.println("The number " + target + " is not found in the array.");
        }
    }

    public static int findNumber(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

