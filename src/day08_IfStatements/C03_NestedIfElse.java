package day08_IfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        emeklilik kontrolu yapan bir program yaziniz
        Erkek "e", Kadın "K" kabul etsin, farklı sembol girilirse hata mesaji versin
        Emeklilik siniri kadinlarda 60, erkeklerde 65 olsun
        Eksi yaş ve 80 uzeri yazilirsa hata mesaji versin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        char cinsiyet=scan.next().toUpperCase(Locale.ROOT).charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet=='E'){
            if (yas<0||yas>80){
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas<65){
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli Olabilirsiniz");
            }



        } else if (cinsiyet=='K'){
            if (yas<0||yas>80){
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas<60){
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli Olabilirsiniz");
            }


        } else {
            System.out.println("Lutfen gecerli bir cinsiyet giriniz");
        }
    }
}
