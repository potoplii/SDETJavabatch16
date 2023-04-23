package class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog = new Dog();
        actualDog.name = "Jacky";
        actualDog.age = 50;
        actualDog.breed = "German";
        actualDog.color = "Black";
        actualDog.weight = 50;
        actualDog.isFat = false;
        actualDog.bark();

        Dog sharik = new Dog();
        sharik.name = "Sharik";
        sharik.age = 10;
        sharik.breed = "Mexican";
        sharik.color = "Gold";
        sharik.weight = 20;
        sharik.isFat = false;
        sharik.sleep();

    }

}
