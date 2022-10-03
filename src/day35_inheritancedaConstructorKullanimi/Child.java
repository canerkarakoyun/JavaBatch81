package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {
    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();
        // bu objeyi olusturmak icin Grandpa Cons. calisir
        // Parent veya Child Constructor calismaz

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="child2";

        // child1 objesi icin Child Cons. calisir
        /*
        Java'da bir class'i kullanabilmek icin
        o class'dan obje olusturur, dolayisiyla
        o class'in constructor'ini kullanirdik

        Java inheritance'da parent class'lardaki ozellikleri
        kullanabilmek icin, o class'larin constructor'larini otomatik
        calistiran bir yapi kurmustur.

        Ornegin biz child class'inda, child class'indan bir obje olusturmak istedigimizde
        child constructor'ini kullaniriz.

        Java Child(){} gordugunde
        once parent'in constructor'ini calistirmam lazim der
        buradan Parent Cons.'a gider.
        Parent class'inda Parent(){} gordugunde
        once bunun Parent'inin yani Grandparent cons.'un calismasi gerekir der
        Bu en Parent class'a, yani extends keyword'unu gormeyene kadar gider
        ve oradan baslayarak tum cons'lari asagi dogru calistirir.
         */
    }
}
