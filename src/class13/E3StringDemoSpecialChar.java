package class13;

public class E3StringDemoSpecialChar {
    public static void main(String[] args) {
        String str="jhgkkuDDDtYUIJNjhhgyg*&&^%$%#@#$@";

        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[Dt&]",""));
        //System.out.println(str.replaceAll("[A-Z]","$")); $ special character use "\\"
        System.out.println(str.replaceAll("[A-Z]","\\$"));



    }
}
