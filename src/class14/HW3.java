package class14;

public class HW3 {
    //Write a method to return whether given number is prime or not?
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int number = 36;
        if (isPrime(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }

    }
}
