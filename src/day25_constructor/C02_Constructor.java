package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        // baska bir class'dan veriable ya da method vb cagirmak icin bir obje
        // olusturabiliriz.

        C01 obj1=new C01();


        // bu sekilde bir obje olusturdugumuzda artik obj1.'i kullanarak
        // C01 cassindan veriable ya da method vs cekebiliriz

        System.out.println(obj1.sayi); // 0
        obj1.denem(); // C01'den deneme methodu calisir


        // CONTRUCTOR: Java'da obje olusturmak icin kullanilan kod blogudur.

        C01             obj2        =           new             C01();
        // Class adi    objenin adi =           keyword         CONSTRUCTOR (yapici)

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list=new ArrayList<>();
        // List<String> list2=new List<>();

        /*
        Java'da bir obje olusturabilmek icin mutlaka constructor kullanmaliyiz.
        Constructor calismadan bir objenin olusmasi MUMKUN DEGILDIR.

        Bir class'dan (kalip) farkli contructor'lar kullanarak birbirinden farkli fakat temelde ayni kaliba
        sahip objeler olusturulabilir.

        Constructor veriable DEGILDIR
        Constructor bir method da DEGILDIR
        Yepyeni bir yapidir
         */

    }
}
