package class2;

public class Logical_Operator {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;

        System.out.println(a < b && b < c); // AND
        System.out.println(a > b || b < c); // OR
        System.out.println(!(a > b));       // NOT
    }
}
