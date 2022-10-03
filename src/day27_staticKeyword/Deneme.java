package day27_staticKeyword;

public class Deneme {

    static int count=0;

    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        Deneme obj1=new Deneme();
        Deneme obj2=new Deneme();

        obj1.increment();
        System.out.println("Obj1 count degeri : "+obj1.count);
        obj2.increment();

        System.out.println("Obj1 count degeri : "+obj1.count);
        System.out.println("Obj2 count degeri : "+obj2.count);
    }
}
