package class12;

public class E10StringDemoCharAt {
    public static void main(String[] args) {
        String name="LEANDROR";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        int count=0;
        for (int i = 0; i <name.length() ; i++) {
           // System.out.print(name.charAt(i));
            if (name.charAt(i)=='R'){
                count++;
            }


        }System.out.println(count);
    }
}
