package class22;

public interface ArrayUtil {
    //search the array for the number if found return true
    public boolean searchArr(int [] array,int number);

}
class Main implements ArrayUtil {
    @Override
    public boolean searchArr(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true; // Return true if the number is found in the array
            }
        }
        return false; // Return false if the number is not found in the array
    }
}