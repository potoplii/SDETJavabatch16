package class14;

public class HW1tester {

            public static void main(String[] args) {
                Language language = new Language();
                language.sayHello("USA"); // prints "Hello!"
                language.sayHello("France"); // prints "Bonjour!"
                language.sayHello("Germany"); // prints "Guten Tag!"
                language.sayHello("China"); // prints "Language not supported."
    }
}
