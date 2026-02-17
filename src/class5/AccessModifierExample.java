package class5;

public class AccessModifierExample {

    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;   // default access
    private int privateVar = 40;

    public void showValues() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }

    public static void main(String[] args) {
        AccessModifierExample obj = new AccessModifierExample();
        obj.showValues();
    }
}


class Test {
    public static void main(String[] args) {

        AccessModifierExample obj = new AccessModifierExample();

        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);

         System.out.println("Private modifier is eiligible");
    }
}