package class8;

import java.util.Scanner;

public class E3WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int numb = scanner.nextInt();
        while (numb != -1) {
            System.out.println("Try again");
            numb = scanner.nextInt();


        }

    }
}

