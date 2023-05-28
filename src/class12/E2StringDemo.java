package class12;

public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String passWord="pass123";
        // String user=new String();
        // String password=new String();
        if (userName.length()>8 && passWord.length()>8) {
            System.out.println("Username and password can't be more than 8 character");
        }else {
            System.out.println("Singup succeseful");

        }

    }
}
