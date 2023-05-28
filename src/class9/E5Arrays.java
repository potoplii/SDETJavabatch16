package class9;

public class E5Arrays {
    public static void main(String[] args) {
        String[] names = {"Joe", "Jim", "Kim", "Ana", "Ben"};
        // System.out.println(numbers.length);
        // System.out.println (numbers[i]);
        for (int j = 0; j < names.length; j++) { //j< numbers.length; < must be
            // for (int j = 0; j< names.length -1 or -3; j++)
            // for (int j = 3; j< names.length-3; j++) sout nothing
            System.out.print(names[j] + " ");
        }
        System.out.println();//for print sout on next line
        int counter=0;
        while (counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}



