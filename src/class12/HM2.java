package class12;

public class HM2 {
    public static void main(String[] args) {
        /*
          Create a String and print it in reverse order (Sunday → yadnuS).




        System.out.print(string.charAt(0));
        System.out.print(string.charAt(1));
        System.out.print(string.charAt(2));
        System.out.print(string.charAt(3));
        System.out.print(string.charAt(4));
        System.out.print(string.charAt(5));
        System.out.println();

        for (int i = 0; i <string.length() ; i++) {

            System.out.print(string.charAt(i));
*/
        String string = "Sunday";
        System.out.println();
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));

        }
    }
}



