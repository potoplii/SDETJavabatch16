package class8;

public class E9NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 1; j++) {
                System.out.print("/*");
                System.out.println();
            }for (int a=0;a<4;a++){
                int b=2;
                while (b<=10){
                    System.out.print(b+" ");
                    b+=2;

                }for (int c=0;c<1;c++){
                    System.out.println();



                    }
                    System.out.println();

                }

            }
            System.out.println("*/");



        }
    }

