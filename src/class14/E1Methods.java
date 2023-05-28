package class14;

public class E1Methods {
    void  printWord(String word){
        System.out.println(word);
    }
     /*
     void => return type of the method  void means does not return any data
     other examples of return types can be string int boolean char Dog Cat etc.
     printWord=> it's the name of method
     (String word) => parameters/input
     {System.out.println(word);}=> body of the method you can write if else conditions loop
     */



    public static void main(String[] args) {
        //we are creating an object of th E1Methods class
        //in java all classes can be treated as data type
        //new E1Methods() => creating the object of the E1Methods class
        E1Methods obj=new E1Methods();
        //we are calling the printWord() method on obj object and passing "java" as argument or input
        obj.printWord("Java");
    }
}
