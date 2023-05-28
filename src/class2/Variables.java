package class2;

public class Variables {
    public static void main(String[] args) {
        String name="John";
        String lastName="Smith";
        String  grade="A";
        String  city="Albuquerque";
        String state="New Mexico";
        String stud="student";
        String  phoneNumber="50512345678";
        String sentence1="My name is";
        String sentence2="and my last name is";
        String sentence3="I am";
        String sentence4="I live in city";
        String sentence5="and state";
        String sentence6="And my phone number is";
        String sentence7="and i moved to";
        System.out.println(sentence1+" "+name+" "+sentence2+" "+lastName);
        System.out.println(sentence3+" "+grade+" "+stud);
        System.out.println(sentence4+" "+city+" "+sentence5+" "+state);
        System.out.println(sentence6+" "+phoneNumber);
        city="Amarillo";
        state="Texas";
        phoneNumber="90912345678";
        grade="B";
        sentence6="My new phone number is";
        System.out.println(sentence1+" "+name+" "+lastName+" "+sentence7+" "+city+" "+state+". "+sentence6+" "+phoneNumber);



    }
}
