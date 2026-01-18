package class4;

public class Constructor {
    String name;
    int age;

    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        Constructor cn=new Constructor("Mosabbir",24);
        cn.show();
    }

}
