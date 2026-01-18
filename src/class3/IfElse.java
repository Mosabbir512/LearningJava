package class3;

public class IfElse {
    public static void main(String[] args) {

        int age=20;
        if(age<18){
            System.out.println("He/She is not Eligible to vote");
        }else {
            System.out.println("He/She is Eligible to vote");
        }


        int marks=75;
        if(marks>=80){
            System.out.println("A+");
        }
        else if(marks>=70){
            System.out.println("A-");
        }
        else if(marks>=60){
            System.out.println("B");
        }
        else if(marks>=50){
            System.out.println("C");
        }
        else if(marks>=33){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }


        if(age>=18){
            Boolean yes=false;
            if(yes){
                System.out.println("Eligible for vote");
            }
            else {
                System.out.println("NID Required");
            }
        }

    }

}
