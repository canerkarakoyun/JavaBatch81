package day34_inheritance;

public class ToyotaCorolla extends Toyota{
    public static void main(String[] args) {
        /*
        child class'dan parent class'a erisimde access modifier kurallarini
        bypass edemeyiz. Ornegin, parent class'daki private class uyelerini
        child class'indan kullanamayiz.
        ayni sekilde parent ve child farkli package'larda ise parent class'daki
        default access modifier olan class uyelerini child class'dan kullanamayiz
         */

        ToyotaCorolla araba1=new ToyotaCorolla();
        System.out.println(araba1.marka); // Toyota
        System.out.println(araba1.model); // Model belirtilmedi
    }
}
