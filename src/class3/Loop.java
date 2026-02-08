package class3;

public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println("print = " + i);
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

    }
}
