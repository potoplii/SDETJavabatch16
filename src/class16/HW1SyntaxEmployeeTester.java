package class16;

import class15.SyntaxEmployee;

public class HW1SyntaxEmployeeTester {
    public static void main(String[] args) {
        HW1SyntaxEmployee employee1 = new HW1SyntaxEmployee();
        employee1.empID = 1234;
        employee1.salary = 50000.0;


        HW1SyntaxEmployee employee2 = new HW1SyntaxEmployee();
        employee2.empID = 5678;
        employee2.salary = 75000.0;

        System.out.println("Employee 1:");
        System.out.println("empID: " + employee1.empID);
        System.out.println("salary: " + employee1.salary);
        System.out.println("CEO: " + employee1.CEO);

        System.out.println("Employee 2:");
        System.out.println("empID: " + employee2.empID);
        System.out.println("salary: " + employee2.salary);
        System.out.println("CEO: " + employee2.CEO);
    }
}
