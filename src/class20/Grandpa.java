package class20;

public class Grandpa {
    double money=150;
}
class Father extends Grandpa{
    double money=100;
}

class Childe extends Father{
    void printeMoney(){
        System.out.println(money);
    }
}
class Tester{
    public static void main(String[] args) {
        Childe ch=new Childe();
        ch.printeMoney();
    }
}