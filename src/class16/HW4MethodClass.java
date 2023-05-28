package class16;

public class HW4MethodClass {

        private String getVowels(String str) {
            StringBuilder vowels = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels.append(ch);
                }
            }
            return vowels.toString();
        } public static void main(String[] args) {
        HW4MethodClass myClass = new HW4MethodClass();
        String inputString = "Hello, world!";
        String vowelsOnly = myClass.getVowels(inputString);
        System.out.println("Input string: " + inputString);
        System.out.println("Vowels only: " + vowelsOnly);
    }
    }

