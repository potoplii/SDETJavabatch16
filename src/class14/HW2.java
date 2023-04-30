package class14;

public class HW2 {
    //Create a method createEmail().
    // Based on values of users firstName, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
} class createEmail{
    String firstLastEmail(String firstName,String lastName,String emailType){
        String eMail=(firstName+lastName+"@"+emailType+".com");
        return eMail;
    }


    public static void main(String[] args) {
        createEmail obj=new createEmail();

        System.out.println(obj.firstLastEmail("John","Snow","gmail").toLowerCase());

    }
}
