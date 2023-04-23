package class12;

public class E5StringDemoIsEmptyBlank {
    public static void main(String[] args) {
        String name="  ";
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());//it checks the spaces as well
    }
}
