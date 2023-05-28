package class1;

public class Practice {
    public static void main(String[] args) {
        String part1="neso";
        String part2="academy";
        System.out.println(part1+part2);
        System.out.println(part1+" "+part2);
        System.out.println(part1+" "+part2+3);
        System.out.println(part1+" "+part2+3+5);
        System.out.println(part1+" "+part2+(3+5));
        System.out.println(part1.concat(part2));
        System.out.println(part1.concat(" ").concat(part2));
        System.out.println(part1.concat(" ").concat(part2).concat("5"));
        System.out.println(part1.concat(" ").concat(part2).concat(("5")+("3")));
        System.out.println(part1.concat(" ").concat(part2).concat(("(5+3)")));
        System.out.println(part1.concat(" ").concat(part2+(5+3)));
    }

}


