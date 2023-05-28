package class14;

public class HW4 {
    //Create  class Student that will have a method getGrade.
    // Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F
}class Student {
    void getGrade(int score) {
        if (score>=90){
            System.out.println('A');
        } else if (score>=80 && score<=89) {
            System.out.println('B');
        } else if (score>=70 && score<=79) {
            System.out.println('C');
        } else if(score>=50 && score<=69) {
            System.out.println('D');

        }else if (score<50){
            System.out.println('F');
        }


    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.getGrade(50);


    }
}


