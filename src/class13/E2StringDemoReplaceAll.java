package class13;

public class E2StringDemoReplaceAll {
    public static void main(String[] args) {
        String str="jhgkkuDDDtYUIJNjhhg      yg*&&^%$%#@#$@";

        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[0-9]","%"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));
        System.out.println(str.replaceAll("[a-zA-Z]","%"));
        System.out.println(str.replaceAll("[A-z]","%"));
        System.out.println(str.replaceAll("[ ]",""));

        char c='A';
        c++;
        System.out.println(c);
        for (int i = 0; i <10 ; i++) {
            System.out.print(c++);
        }


    }
}
