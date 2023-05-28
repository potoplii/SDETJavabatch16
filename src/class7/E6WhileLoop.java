package class7;

public class E6WhileLoop {
    public static void main(String[] args) {
        int counter=10;
        while (counter>=1) {//(counter<15) or (counter>=2&&counter<=14)
            System.out.println(counter);//.print(counter+" ") printing in the same line

            counter--;//counter=counter+1; (counter+=2 is the shortest one)
            
        }
    }
}
