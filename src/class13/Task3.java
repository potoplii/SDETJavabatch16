package class13;

public class Task3 {
    public static void main(String[] args) {
        String str="Today is Sunday. we2353455437668768 have Java class! right ? we do&$*(%(*)^)(^)((())n't like Java";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());
       // String [] strArr=str.split("[a-zA-Z0-9]");
        //System.out.println(strArr.length);
        }
    }

