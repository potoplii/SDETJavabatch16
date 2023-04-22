package class7;

public class E8WhileLoop {
    public static void main(String[] args) {
        int counter = -1;
        while (counter <= 20) {
            /*
             if (counter%3 == 0) {
             }else{
             System.out.print(counter + " ");
             }
             counter++;
             }
             */

            if (counter%3 != 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        // counter-=5; counter=counter+1; (counter+=2 is the shortest one)
    }
}


