package class12;

public class E12StringDemoSubstring {
    public static void main(String[] args) {
        String sentence = "yup we have another class";
        System.out.println(sentence.substring(12));
        System.out.println(sentence.substring(7));
        System.out.println(sentence.substring(4, 11));
        System.out.println(sentence.substring(12, 19));

        int startIndex = sentence.length() - 5;

        System.out.println(sentence.substring(startIndex));
        // int startIndex=sentence.length()-4;
        // System.out.println(sentence.substring(startIndex));
    }
}
