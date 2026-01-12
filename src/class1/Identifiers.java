package class1;

public class Identifiers {
    int number1 = 10 ;
    int _count = 5 ;
    int $amount = 100 ;

    int value = 10 ;
    int Value = 20 ;

    int studentAge = 20 ;
    String studentName = "Mosabbir" ;

    public static void main(String[] args) {
        Identifiers obj = new Identifiers();

        System.out.println("number1 : "+obj.number1 );
        System.out.println("_count : "+obj._count);
        System.out.println("amount : "+obj.$amount);
        System.out.println("value : "+obj.value);
        System.out.println("Value : "+obj.Value);
        System.out.println("studentAge :"+obj.studentAge);
        System.out.println("studentName: "+obj.studentName);
    }
}
