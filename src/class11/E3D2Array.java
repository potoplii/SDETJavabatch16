package class11;

public class E3D2Array {
    public static void main(String[] args) {

        String[][] names2DArray = {
                {"sara", "artiom", "lean", "semir"},
                {"farwa", "halima", "alina", "semir"}
        };
        for (String[] name1DArry:names2DArray){
            for (String name:name1DArry){
                System.out.println(name);
            }
        }


    }
}
