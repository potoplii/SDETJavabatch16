package class7;

public class E5WhileLoop {
    public static void main(String[] args) {
        int counter=3;
        while (counter<=13) {//(counter<15) or (counter>=2&&counter<=14)
            System.out.print(counter+" ");

            counter+=2;//counter=counter+1; (counter+=2 is the shortest one)
            
        }
    }
}
