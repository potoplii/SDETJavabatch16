package class12;

public class  Task1 {
    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
         */

        String username="Ben";
        String password="12345678";
        String confirmpasword="12345678";
        if (username.isBlank()&&password.isBlank()) {
            System.out.println("Username and pasword cannot be empty");
        }else if (password.length()<8) {
            System.out.println("Pasword is too short");
        }else if (password.contains(username)) {
            System.out.println("User name cannot contain username");
        } else if (!password.equals(confirmpasword)) {
            System.out.println("Pasword do not match");
        }else {
            System.out.println("Yor username and pasword hase ben created");



        }


    }

}
