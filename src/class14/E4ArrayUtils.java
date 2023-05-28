package class14;

public class E4ArrayUtils {
    /*
    create a method to add two int numbers and should return the results back when called name of the methods should be add
     */
    /*
    return type=> int
    name of the methode=> add
    parameters =>(int a,int b){
    int sum=a+b;
    retune sum;
    }
     */
    int add(int a, int b) {
        int sum = a + b;
        return sum;


    }

    public static void main(String[] args) {
        E4ArrayUtils obj=new E4ArrayUtils();

        int sum= obj.add(10,20);
        obj.add(10,20);
        /*
        we are calling the "add" method on "obj" object passing two arguments one is 10 other is 20
         and storing the results from method call into the sum variable
         */
        System.out.println(obj.add(10,20));
        System.out.println(sum);

    }
}