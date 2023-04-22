package class7;

public class E9WhileLoop {
    public static void main(String[] args) {
        int counter = 100;
        while (counter > 0) {
            System.out.print(counter + " ");
            counter--;
            // counter-=5; counter=counter+1; (counter+=2 is the shortest one)
        }
        counter = 20;
        System.out.println();
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter += 2;
        }
        counter = 100;
        System.out.println();
        while (counter >= 1) {
            if (counter % 2 == 1) {//(counter%2!=0)
                System.out.print(counter + " ");
            }
            counter--;
        }
    }
}
