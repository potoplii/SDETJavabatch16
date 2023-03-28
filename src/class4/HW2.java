package class4;


import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*2) You are a loan specialist and you need to ask user what is the amount of loan
          is needed. If loan is less or equal to 200,000 then you would lend the money
          otherwise you would reject the client.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your amount of loan you need?");
        int loan=scanner.nextInt();
        if (loan<=200000) {
            System.out.println("Congratulations we will lend the money in amount of $"+loan);
        }else {
            System.out.println("Sorry we will NOT lend the money in amount of $"+loan);
        }



    }
}


