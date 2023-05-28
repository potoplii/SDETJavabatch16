package class7;

public class E7WhileLoop {
    public static void main(String[] args) {
        int counter = 25;
        while (counter >= 5) {//(counter<15) or (counter>=2&&counter<=14)
            //.print(counter+" ") printing in the same line
            if (counter != 10 && counter!=15) {
                System.out.print(counter + " ");

            }
            counter -= 5;
        }
        // counter-=5; counter=counter+1; (counter+=2 is the shortest one)
    }
}

