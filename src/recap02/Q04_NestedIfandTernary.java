package recap02;

import java.util.Scanner;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {
        /*
        0-9 arasindaki sayilari cevirebilen bir program yaziniz
        kelimelere, sayi 9'dan buyukse ya da 0'dan kucukse cikti "Gecersiz" olmalidir.
        girilen sayi kac ise yazi ile yazdiralim
        hem NestedIf hem de Ternary kullanarak cozelim
         */

        //NestedIf

        int sayi=8;
        String sonuc= "";

        if (sayi>=0 && sayi<=9){
            if (sayi==9){
                sonuc="dokuz";
            } else if (sayi==8){
                sonuc="sekiz";
            } else if (sayi==7){
                sonuc="yedi";
            } else if (sayi==6){
                sonuc="alti";
            } else if (sayi==5) {
                sonuc = "bes";
            } else if (sayi==4) {
                sonuc = "dort";
            } else if (sayi==3) {
                sonuc = "uc";
            } else if (sayi==2) {
                sonuc = "iki";
            } else if (sayi==1) {
                sonuc = "bir";
            } else{
                sonuc="sifir";
            }
        } else{
            sonuc="Gecersiz";
        }

        System.out.println("sonuc = " + sonuc);


        // Ternary

        int num=9;

        String result=  num==9?"dokuz"
                        : num==8?"sekiz"
                        : num==7?"yedi"
                        : num==6?"alti"
                        : num==5?"bes"
                        : num==4?"dort"
                        : num==3?"uc"
                        : num==2?"iki"
                        : num==1?"bir"
                        : num==0?"sifir"
                        :"Gecersiz";
        System.out.println("result = " + result);
    }
}
