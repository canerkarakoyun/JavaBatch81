package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // Kullanicidan gun numarasini alip;
        // 1 ise Pazartesi, .... , 7 ise Pazar yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int gunNo= scan.nextInt();

        /*
        Switch yanina yazilan ( ) case'leri neye gore atayacagimizi gosterir
        Java girilen degere gore case'i bulur ve o satirdan calistirmaya baslar
        Break yazisi gorunceye ya da Switch parantesini gorene kadar durmaz
        Bu nedenle buldugunda durmasini istiyosak her case'den sonra break; yazmaliyiz.
        En sona da default: yazarsak geriye kalan tüm olasiliklari bunun icine toplariz.
         */

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
            case 2 :
                System.out.println("Sali");
            case 3 :
                System.out.println("Carsembe");
            case 4 :
                System.out.println("Persembe");
            case 5 :
                System.out.println("Cuma");
            case 6 :
                System.out.println("Cumartesi");
            case 7 :
                System.out.println("Pazar");
        }

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsembe");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Lutfen gecerli bir sayi giriniz");
        }
    }
}
