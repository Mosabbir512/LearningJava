package class5;

class Bank {
    int getRate() {
        return 5;
    }
}

class SBI extends Bank {
    int getRate() {
        return 7;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b = new SBI(); // Upcasting
        System.out.println("Rate of Interest: " + b.getRate());
    }
}
