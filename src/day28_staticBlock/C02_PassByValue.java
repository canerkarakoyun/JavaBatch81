package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90.0
        System.out.println(satisFiyati); //100.0
        System.out.println(indirimliFiyat(satisFiyati)); // 90.0

        // Iki farkli method'da satisFiyati isminde variable olabilir, Java buna itiraz etmez
        // Cunku scope'lari farklidir.

    }

    public static double indirimliFiyat(double originalFiyat) {
        // %10 indirim yapip yeni fiyati main method'a dondursun
        double satisFiyati=originalFiyat*0.9;

        return originalFiyat*0.9;

    }
}
