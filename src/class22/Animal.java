package class22;

public abstract class Animal {
    /*
    create 3 animals like Dog Cat and Horse
    define 3 common methods in each class like speak eat and sleep.
    create the object of all the classes and call the methods.
     */
   private String name;
   private String color;
   final private String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak();
   abstract void eat();
   abstract void sleep();
   void printInfo(){
       System.out.println(name+" "+color+" "+breed);
   }
}
class Dog extends Animal{
    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Woof woof");
    }
    @Override
    void eat(){
        System.out.println("Treats");
    }
    @Override
    void sleep(){
        System.out.println("Sleep 10 hours");
    }
}
class Cat extends Animal {
    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Miau miau");
    }

    @Override
    void eat() {
        System.out.println("Fish");
    }

    @Override
    void sleep() {
        System.out.println("Sleep 11 hours");
    }
}
class Horse extends Animal {
    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Nihaha-nihaha");
    }

    @Override
    void eat() {
        System.out.println("Grass");
    }

    @Override
    void sleep() {
        System.out.println("Sleep 2-3 hours");
    }
}