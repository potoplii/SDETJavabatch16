package class19;

public class Math {
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void addOneIntOneDouble(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void addTowDouble(double num1,double num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        add(10,10);
        addOneIntOneDouble(10,20.5);
        addTowDouble(20.6,45.7);

    }
}
