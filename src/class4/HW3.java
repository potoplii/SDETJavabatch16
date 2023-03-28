package class4;


import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*3)You are DMV representative and you need to ask customer their age.
           If they are 18 and older you will issue a driver license to them, otherwise you
           will offer them to get a learners permit.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age?");
        int age=scanner.nextInt();
        if (age>=18) {
            System.out.println("DMV will issue a driver license to you.");
        }else {
            System.out.println("DMV will offer a learners permit to you.");

        }
    }
}


