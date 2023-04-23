package class12;

public class E6StringDemoEqualsIgnoreCase {
    public static void main(String[] args) {
        String name="Ben";
        System.out.println(name.equals("Axel"));
        System.out.println(name.equals("Ben"));
        System.out.println(name.equalsIgnoreCase("BEN"));
        System.out.println(!name.equalsIgnoreCase("BEN"));
    }
}
