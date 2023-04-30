package class14;

public class E5Tester {
    public static void main(String[] args) {
        int[] arr={10,20,56};
        int number=200;
        E5ArrayUtils obj=new E5ArrayUtils();
        obj.contains(arr,number);
        boolean result= obj.contains(arr,number);
        System.out.println(result);
    }
}
