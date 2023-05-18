package class21;

public class Parent {
    final int numOfMonthInYear=12;
  final  void getMarry(){
      //numOfMonthInYear=13;
        System.out.println("Marry Shakira ");
    }
    void study(){
        System.out.println("Study Medicine");
    }
}
class Axel extends Parent{
    @Override
    void study(){
        System.out.println(numOfMonthInYear);
        System.out.println("No i want SDET");
    }
}
