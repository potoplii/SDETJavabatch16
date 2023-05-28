package class12;

public class E4StringDemoConcat {
    public static void main(String[] args) {
        String firstName="Ana";
        String lastNmae="Tasevska";
        String fullName=firstName+" "+lastNmae;//Most widley used approach
        System.out.println(fullName);
        System.out.println(firstName.concat(" "+lastNmae));
    }
}
