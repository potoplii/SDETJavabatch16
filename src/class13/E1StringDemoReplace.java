package class13;

import java.util.Scanner;

public class E1StringDemoReplace {
    public static void main(String[] args) {
      /*  String str="Batch 16 is bad";
        str=str.replace("bad","Excellent").u;
        //System.out.println(str.replace("bad","Excellent"));
        System.out.println(str);
        System.out.println(str.replace('e','E'));
    }
}*/
    String str = "abracadabra alakazam";
    String target1 = "dab";
    String target2 = "ABRA";


    int index1 = str.indexOf("c");
        System.out.println(index1);


                int index2 = str.indexOf(" ");
                System.out.println(index2);


                int index3 = str.indexOf(target1);
                System.out.println(index3);


                int index4 = str.indexOf(target2);
                System.out.println(index4);
                }

}

