package class4;


import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
       /*4)Create a Java program that will ask user to input city and temperature.
           Your program should convert Fahrenheit into celsius and print
           “The temperature is __ the city is __”” */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter City");
        String city=scanner.nextLine();
       System.out.println("Enter the temperature in Fahrenheit ");
       double tempF= scanner.nextDouble();
       double tempC=(tempF-32)*5/9;
        System.out.println("The temperature in "+city+" is "+tempC+" Celsius");

        }
    }



