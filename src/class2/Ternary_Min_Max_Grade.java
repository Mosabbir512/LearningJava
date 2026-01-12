package class2;

public class Ternary_Min_Max_Grade {
    public static void main(String[] args) {

        int x = 25, y = 40;
        int marks = 78;

        int max = (x > y) ? x : y;
        int min = (x < y) ? x : y;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        String grade = (marks >= 80) ? "A+" :
                (marks >= 70) ? "A" :
                        (marks >= 60) ? "A-" :
                                (marks >= 50) ? "B" : "Fail";

        System.out.println("Grade: " + grade);
    }
}
