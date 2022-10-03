package day07_IfStatement_Rpt;

public class C02_IfStatements {
    public static void main(String[] args) {
        int sayi=10;

        if (sayi>0){
            System.out.println("Sayi Pozitif"); // sayi negatifse yazdirmaz
        }

        if (sayi %2==0){
            System.out.println("Sayi cift"); // sati tekse yazdirmaz
        }

        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati"); // sayi 5'in kati degilse yazdirmaz
        }

        /*
        Basit if cumleleri kodun diger parcalarindan bagimsizdir
        Sadece bir sart kontrol eder, sart saglaniyorsa if body calisir, yoksa calismaz
        birden fazla basit if cumlesi varsa girilen sarta bagli olarak,
        tumunde if bodysi calisabilir, kismen if bodysi calisabilir
        veya hicbir if bodysi calismayailir
         */

    }
}
