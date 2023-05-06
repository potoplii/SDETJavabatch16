package class15;

public class E3 {
    int sumArr(int[] arr) {
        int sum = 0;
        for (int i=0 ;i< arr.length; i++) {
            sum=sum+arr[i] ;
        }
        return sum;
    }

    public static void main(String[] args) {
        E3 e3=new E3();
        int sum= e3.sumArr(new int[]{10,10,10});
        System.out.println(sum);
    }

    }

