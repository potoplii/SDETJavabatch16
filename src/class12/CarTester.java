package class12;

public class CarTester {
    public static void main(String[] args) {


        Car chevyCarC8 = new Car();
        chevyCarC8.engineSize = 6.2;
        chevyCarC8.cylinders = 8;
        chevyCarC8.color = "Red";
        chevyCarC8.running = true;
        chevyCarC8.weight = 4300;

        chevyCarC8.fly();
    }
}