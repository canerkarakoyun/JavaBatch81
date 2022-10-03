package recap02;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
        /*
        Kullanicidan boyunu cm olarak ve vucut agirligini kg olarak isteyin ve BMI hesaplatin
        BMI=kilo/(boy*boy)
        BMI<=20 ise "Oldukca zayifsiniz"
        20<BMI<=25 "Normal Sinirlardasiniz"
        25<BMI<=30 "Sisman kategorisindesiniz"
        30<BMI ise "Obez grubundasiniz"
        yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        double boy= scan.nextDouble()/100;


        System.out.println("Lutfen vucut agirliginizi kg cinsinden giriniz");
        double kilo= scan.nextDouble();

        double bmi=kilo/(boy*boy);

        if (bmi<=20){
            System.out.println("BMI : " + bmi + " (Oldukca zayifsiniz)");
        } else if (bmi<=25){
            System.out.println("BMI : " + bmi + " (Normal sinirlardasiniz)");
        } else if (bmi<=30){
            System.out.println("BMI : " + bmi + " (Sisman kategorisindesiniz)");
        } else {
            System.out.println("BMI : " + bmi + " (Obez grubundasiniz)");
        }
    }
}
