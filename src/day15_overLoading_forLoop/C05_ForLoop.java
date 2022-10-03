package day15_overLoading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // 1'den 5'e kadar olan tam sayilari toplayalim

        int toplam=0;

        for (int i = 1; i <=5 ; i++) {

            toplam+=i;

            // NOT: sout'u loop body icerisine yazilirsa her donuste yazdırır. O yuzden bady disina yazilir.
            
        }

        System.out.println("1-5 arasi toplam : "+toplam);

        // 10 dahil 20 dahil aradaki sayilari toplayalim

        toplam=0;

        for (int i = 10; i <=20 ; i++) {

            toplam += i;
        }
        System.out.println("10-20 arasi toplam : "+toplam);

        // 30 dahil 50 dahil aradaki cift sayilari toplayalim

        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {

            toplam += i;
        }
        System.out.println("30-50 arasi cıft sayilar toplami : "+toplam);

        toplam=0;

        for (int i = 30; i <=50 ; i++) {
            if (i%2==0) {
                toplam += i;
            }

        }
        System.out.println("30-50 arasi cift sayilar toplami 2. yontem : "+toplam);

        // 1500 ile 1600 arasında (sinirlar dahil) 7 ile bolunebilen sayilarin toplamini bulunuz
        toplam=0;

        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }

        }
        System.out.println("1500-1600 arasi 7 ile bolunebilen sayilar toplami : "+toplam);
    }
}
