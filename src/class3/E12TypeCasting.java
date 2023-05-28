package class3;

public class E12TypeCasting {
    public static void main(String[] args) {
        /*short num=1200;
        byte num2=num;
        System.out.println(num2); Error */
        short num=1200;//if is in range of byte is working -127/128
        byte num2=(byte) num;
        System.out.println(num2);// -80 error

    }
}
