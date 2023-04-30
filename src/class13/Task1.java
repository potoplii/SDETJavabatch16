package class13;

public class Task1 {
    public static void main(String[] args) {
        //String  str=new String("Java");
        String str="Java";
        if (!str.isBlank() && str.length()%2!=0 && str.length()>=3){
            int mid=str.length()/2;
            char middleChar=str.charAt(mid);
            System.out.println(middleChar);
        }
    }
}
