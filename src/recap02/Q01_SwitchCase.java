package recap02;

import java.util.Locale;
import java.util.Scanner;

public class Q01_SwitchCase {
    public static void main(String[] args) {
        /*
        Pazartesi ve Sali gunleri "Java dersi"
        Persembe ve Cuma gunleri "Selenyum dersi"
        Carsamba ve cumartesi gunleri "SQL dersi"
        Aksi halde "Izin gunu"
        yazdiran bir program yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun bilgisi giriniz");
        String gun= scan.nextLine().toLowerCase(Locale.ROOT);

        switch (gun){
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi");
                break;
            default:
                System.out.println("Izin gunu");
        }

    }
}
