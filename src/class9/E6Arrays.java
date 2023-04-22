package class9;

public class E6Arrays {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            if (j % 2 == 0) {
                System.out.print(j+" ");
            }

        }
        System.out.println();
        char[] chars={'A','B','C','D','E'};
        for (int i=0;i< chars.length;i+=2){
            //if(i%2==0){
                System.out.print(chars[i]+" ");
            }
        }
    }



