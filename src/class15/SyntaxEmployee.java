package class15;

public class SyntaxEmployee {
    String empId;
    int salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.empId="123456";
        asghar.salary=90000;
        System.out.println(asghar.CEO);// not prefered way
        System.out.println(SyntaxEmployee.CEO);// 99.99 this how they are used

        SyntaxEmployee shoail=new SyntaxEmployee();
        shoail.empId="5456457657";
        shoail.salary=92000;
        System.out.println(shoail.empId);
        System.out.println(asghar.empId);
    }
}
