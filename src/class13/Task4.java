package class13;

public class Task4 {
    public static void main(String[] args) {
        /*
      You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
         */
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr=a.split("[?]");
        System.out.println(strArr.length);
       // System.out.println();
       // String [] strArr=str.split("[a-zA-Z0-9]");
        //System.out.println(strArr.length);
        }
    }

