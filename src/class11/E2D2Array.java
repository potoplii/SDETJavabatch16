package class11;

public class E2D2Array {
    public static void main(String[] args) {

            String[][] names = {
                    {"sara","artiom","lean","semir"},
                    {"farwa","halima","alina","semir"}
            };
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j <names[i].length ; j++) {
                System.out.print(names[i][j]+" ");

            }

        }

            }}