package class4;

public class Methods {
         void method1(){
             System.out.println("method without return type");
         }
         void method2(int value){
             System.out.println("method with parameter and the value is = "+value);
         }
         int method3(){
             System.out.println("method with return type");
             return 5;
         }
         int method4(int x,int y){
             System.out.println("method with parameter and return type");
             return x+y;
         }

    public static void main(String[] args) {
        Methods methods=new Methods();
        methods.method1();
        methods.method2(20);

        int val=methods.method3();
        System.out.println("value is : "+val);

        int res= methods.method4(4,6);
        System.out.println("The sum is : "+res);
    }
}
