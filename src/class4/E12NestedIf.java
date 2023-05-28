package class4;


import java.util.Scanner;

public class E12NestedIf {
    public static void main(String[] args) {
        if (10>3){
            System.out.println("1");
            if (20>5){
                System.out.println("2");
                if (false){ // should be all true to get output 1 2 3
                    System.out.println("3");//this line depends on condition
                }
            }
        }
        System.out.println(4);//not dependent on if conditions
    }
    }

