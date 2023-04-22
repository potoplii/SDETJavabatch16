package class9;

public class E8Arrays {
    public static void main(String[] args) {
        boolean[] flags={true,false,true,false,true,false};
        int sum=0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i] == false) {
                sum++;

            }
        }
            System.out.println("numbers of flags false is:"+sum);

        }
        }






