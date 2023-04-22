package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age= scanner.nextInt();
        if (age<18) {
            System.out.println("You can't drive");
        }else {
            System.out.println("You can drive");
            */
          Scanner scanner= new Scanner(System.in);
        System.out.println("");
        int money=25_000;
        String day="Monday";
        if (money>10_000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");
            } else {
                System.out.println("Lets wait for sunday");
            }
        }else {
            System.out.println("Lets work more");

        }
    }
}
