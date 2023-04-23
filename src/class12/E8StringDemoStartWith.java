package class12;

public class E8StringDemoStartWith {
    public static void main(String[] args) {
        String sentence=" Java is very very hard";
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence.startsWith("java"));
        System.out.println(sentence.startsWith("Java"));
        System.out.println(sentence.startsWith("Phyton"));
    }
}
