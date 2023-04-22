package class7;

public class E4WhileLoop {
    public static void main(String[] args) {
        int counter=2;
        while (counter<=14) {//(counter<15) or (counter>=2&&counter<=14)
            System.out.println(counter);
            counter++;
            counter++;//counter=counter+1; (counter+=2 is the shortest one)
            
        }
    }
}
