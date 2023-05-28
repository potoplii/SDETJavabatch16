package class14;

public class HW1 {
    //  Create a method that will say Hello in different language
    //  based on the country that will passed when method is executed.
} class Language {
        public void sayHello(String country) {
            switch (country) {
                case "USA":
                    System.out.println("Hello!");
                    break;
                case "France":
                    System.out.println("Bonjour!");
                    break;
                case "Germany":
                    System.out.println("Guten Tag!");
                    break;
                default:
                    System.out.println("Language not supported.");
            }
        }
    }
