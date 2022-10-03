package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {

        int a=1000;
        int b=50;
        int sayac=1;

        while (sayac<100){
            /*
            Try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                        islemleri yazmak icin kullanilir

            Catch'den sonraki parantez karsilasmayi bekledigimiz exception turunu
            Java'ya soylemek icin kullanilir ve

            catch blogu : Java'ya soyledigimiz exception (istisna) gerceklesirse
            Java'nin yapmasini istedigimiz islem.

            catch blogunun oldugu paranteze, karsilasmayi bekledigimiz spesific exception'i
            yazabilir ya da her turlu exception'da devreye girmesini istiyorsak
            tum exceptions'larin babasi olan Exception yazabiliriz
             */

            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("Payda 0 oldu, dikkatli ol");
            }

            b--;
            sayac++;
        }
    }
}
