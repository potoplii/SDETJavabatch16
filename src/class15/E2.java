package class15;

public class E2 {

    String methot1(String str) {
        return str;
    }

    public static void main(String[] args) {

        E2 obj = new E2();
        String string = obj.methot1("Hello world");
        System.out.println(string);
    }
}