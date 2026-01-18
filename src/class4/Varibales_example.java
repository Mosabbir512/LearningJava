package class4;

public class Varibales_example {
    int instanceVariable=50;
    static int staticVariable=20;
    public void showVariables(){
        int localVarialbe=10;

        System.out.println("Instance variable : "+instanceVariable);
        System.out.println("Static varialbe : "+staticVariable);
        System.out.println("Local variable : "+localVarialbe);
    }

    public static void main(String[] args) {
        Varibales_example obj=new Varibales_example();
        obj.showVariables();
    }
}
