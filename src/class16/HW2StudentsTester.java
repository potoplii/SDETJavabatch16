package class16;

public class HW2StudentsTester {
    public static void main(String[] args) {

        HW2Students student1 = new HW2Students();
        student1.Name = "John Doe";
        student1.ID = 1234;
        HW2Students.numberOfStudents++;


        HW2Students student2 = new HW2Students();
        student2.Name = "Jane Smith";
        student2.ID = 5678;
        HW2Students.numberOfStudents++;


        HW2Students student3 = new HW2Students();
        student3.Name = "Bob Johnson";
        student3.ID = 91011;
        HW2Students.numberOfStudents++;


        System.out.println("Total number of students: " + HW2Students.numberOfStudents);

    }
}
