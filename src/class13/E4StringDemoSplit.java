package class13;

public class E4StringDemoSplit {
    public static void main(String[] args) {
        String str="Today is Sunday. we have Java class! right ? we don't like Java";
        String [] strArr=str.split("[.!?]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[2]);

        System.out.println(strArr[2].trim());//.trim will remove space

    }
}
