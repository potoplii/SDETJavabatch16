package class22;

public class Average {

        public static double calculateAverage(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            double average = calculateAverage(array);
            System.out.println("Average: " + average);
        }
    }

