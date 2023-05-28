package class22;

public class AnimalTester {
    public static void main(String[] args) {
     Animal[] animals={new Dog("Bim","Brown","Pudeli"),
             new Cat("Tom","Black","Persian"),
             new Horse("Buian","White","Runner")};
     for (Animal animal:animals){
         animal.eat();
         animal.sleep();
         animal.speak();
     }
     String name="Java";
     name.toLowerCase();
    }
}
