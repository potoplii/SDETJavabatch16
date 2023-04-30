package class14;

public class Task1 {

 void printLargerNumber(int a, int b){
     if (a>b){
         System.out.println(a);;
     }else {
         System.out.println(b);
     }
 }

    public static void main(String[] args) {
        Task1 obj=new Task1();

      obj.printLargerNumber(10,30);

    }
}
