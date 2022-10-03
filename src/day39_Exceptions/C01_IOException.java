package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'dan bilgisyarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz

        Ayni sekilde
        Java'dan bilgisyarimizdaki bir dosyaya ekleme ya da update yapmak istiyorsak
        FileOutputStream Class'indan yardim aliriz
         */

        FileInputStream fis=new FileInputStream("src/day39_Exceptions/Test.txt");

        /*
        Goruldugu gibi Compile Time'da altini kirmizi cizen her durum CT Error degildir.
        Java'da bazi exceptionlar da Compile time Exception'dur.

        Ozellikle dosya okuma ve yazma ile ilgili exception'lar compile Time Exception'dir.

        Compile time Exception olustugunda Java cozum icin 2 ihtimal onerir.
        1. Try-catch ile cevrelemek
        2. Methos Signature'ina throws keyword ile beklenen exception turunu yazmak.

        throws exception, sadece olayin farkinda oldugumuzun deklerasyonudur.
        exception'in handle edilmesinde hicbir rolu yoktur.
        Yani, try-catch ile handle ettigimiz (kontrol altina aldigimiz)
        exception'larda kod calismaya devam ediyordu.
        Ancak, throws exception yazdigimizda Java bir exception ile karsilasirsa hicbirsey yapmamisiz gibi
        hata mesaji yayinlayip calismayi durdurur.
         */

    }
}
