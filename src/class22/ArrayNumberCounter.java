package class22;


    public class ArrayNumberCounter {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 2, 2, 6, 2, 7};
            int targetNumber = 2;
            int count = countOccurrences(numbers, targetNumber);
            System.out.println("The number " + targetNumber + " appears " + count + " times in the array.");
        }

        public static int countOccurrences(int[] array, int target) {
            int count = 0;
            for (int number : array) {
                if (number == target) {
                    count++;
                }
            }
            return count;
        }
    }

