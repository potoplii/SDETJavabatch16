package class17;

import java.util.Scanner;

public class Dog {
    String name;
    String color;
    String breed;
    int age;

    Dog(String dogName,String dogColor,String dogBreed,int dogAge){
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age);
    }

    public static void main(String[] args) {

       /* Dog dog1 = new Dog();
        dog1.name="Bingo";
        dog1.color="Aqumarine";
        dog1.breed="Chihuahua";
        dog1.age=134;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Blue";
        dog2.color="Purple";
        dog2.breed="PamChi";
        dog2.age=78;
        dog2.printInfo();

        Dog dog3=new Dog();
        dog3.name="Sharik";
        dog3.color="Pink";
        dog3.breed="Pudel";
        dog3.age=27;
        dog3.printInfo();

        Dog dog4=new Dog();
        dog4.name="Jack";
        dog4.color="Brown";
        dog4.breed="Corcitura";
        dog4.age=7;
        dog4.printInfo();

        Dog dog5=new Dog();
        dog5.name="Puric";
        dog5.color="Yewlow";
        dog5.breed="Buldog";
        dog5.age=2;
        dog5.printInfo();
        */

        Dog dog1=new Dog("Puricosu","Black","Corcitura",15);
        Dog dog2=new Dog("Bingo","Brown","Chihuahua",23);
        Dog dog3=new Dog("Puppy","Pink","Pomarinian",4);
        Dog dog4=new Dog("Jack","Blue","PamChi",3);
        Dog dog5=new Dog("Bim","White","Shavka",10);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();
        Scanner scanner=new Scanner(System.in);


    }
}