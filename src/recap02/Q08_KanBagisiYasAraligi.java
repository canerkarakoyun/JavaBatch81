package recap02;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
    public static void main(String[] args) {
        /*
        Kullanicidan yasiniz ve kilosunu isteyin;
        18 yasindan kucuk ise "kan bagisi yapamazsiniz"
        18 yasindan buyuk ve 50 kg'in altinda ise "kan bagisi yapamazsiniz"
        18 yasindan buyuk ve 50 kg'dan fazla ise "kan bagisi yapabilirsiniz"
        yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (yas<18){
            System.out.println("Kan bagisi yapamazsiniz");
        } else {
            System.out.println("Lutfen vucut agirliginiz kg cinsinden giriniz");
        }
        double kilo= scan.nextDouble();

        if (kilo<50){
            System.out.println("Kan bagisi yapamazsiniz");
        } else {
            System.out.println("Kan bagisi yapabilirsiniz");
        }


    //    if (yas>=18){
    //        if (kilo<50){
    //            System.out.println("kan bagisi yapamazsiniz");
    //        } else if (kilo>=50){
    //            System.out.println("Kan bagisi yapabilirsiniz");
    //        }
    //    } else {
    //        System.out.println("Kan bagisi yapamazsiniz");
    //    }

    }
}
