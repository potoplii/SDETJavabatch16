package class13;

public class E5StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        System.out.println(str.length());
        System.out.println(str.reverse());




        String str1="Computer";///no StringBuilder .revers
        StringBuilder str2=new StringBuilder(str1);

        System.out.println(str2);
        System.out.println(str2.reverse());


    }
}
