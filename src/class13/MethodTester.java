package class13;

public class MethodTester {
    public static void main(String[] args) {
        Printer printer=new Printer();
        printer.printSomething();

       printer.printWords("Darko");
       printer.printWords("Artiom Lean");

       printer.printWordManyTimes("Axel",15);

    }
}
