package class14;

public class Task2 {
    boolean isPalindrome(String str) {

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)) {
            isStrPalindrome = true;
        }
        return isStrPalindrome;
    }
    boolean isPalindromeSB(String str){
        /*
new StringBuilder(str) => converts the String to a StringBuilder
reverse()=> it reverses the contents in StringBuilder
toString()=> it converts the Stringbuilder back to a String
equalsIgnoreCase(str)=> comparing the reversed String to original one
 */
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }


    public static void main(String[] args) {
        Task2 obj=new Task2();
        boolean results=obj.isPalindrome("car");
        System.out.println(results);

    }

}
