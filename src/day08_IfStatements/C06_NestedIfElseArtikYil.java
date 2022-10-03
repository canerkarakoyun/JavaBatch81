package day08_IfStatements;

import java.util.Scanner;

public class C06_NestedIfElseArtikYil {
    public static void main(String[] args) {
        /*
       Kural 1: Yıl 4'e bolunuyorsa artik yil. 4'e bolunemiyorsa artik yil olamaz.
       Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yil degildir.
       Kural 3: 4'e bolunebilen yıllar aynı zamanda 100'un kati ise 400'un kati olanlar artik yildir
                bolunemiyorsa artik yil degildir.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil= scan.nextInt();

        if (yil%4!=0){
            System.out.println("Artik Yil Degil");

        } else if (yil%100!=0){
            System.out.println("Artik Yil");

        } else if (yil%400!=0){
            System.out.println("Artik Yil Degil");
        } else{
            System.out.println("Artik Yil");
        }
    }
}
