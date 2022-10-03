package day11_StringManipulations;

public class C01_stringMaipulations {
    public static class C01_indexOf {
        public static void main(String[] args) {
            String str="Java ogrenmek cok guzel";
            /*
            Verilen bir stringde herhangi bir string veya charin
            ilk kullanildigi indexi bize dondurur
             */

            System.out.println(str.indexOf('g')); // 6
            System.out.println(str.indexOf("r")); // 7
            System.out.println(str.indexOf("j")); // -1 (yok) (buyuk-kucuk harf duyarli)

            System.out.println(str.indexOf("mek")); // 10 (blok olarak dusunur ve blogun ilk harfini verir)

            // Eger istedigimiz index'den sonrasini kontrol etmek istersek
            // o zaman ayni method'u iki parametreli olarak kullanabiliriz

            System.out.println(str.indexOf('g', 6+1)); // yazilan index'den baslar

            // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
            // 2. e'nin indexini bulabilmek icin 1.nin indexine ihtiyacim var/

            int ilkE=str.indexOf("e");
            int ikinciE=str.indexOf("e", ilkE+1);

            // eger 2. e varsa 3. e'nin olup olmadigini kontrol edelim, varsa yazalim

            if (ikinciE==-1){
                System.out.println("Verilen str'da 2. e yok");
            } else {
                int ucuncuE=str.indexOf("e", ikinciE+1);
                if (ucuncuE==-1){
                    System.out.println("Verilen str'da 3. e yok");
                } else {
                    System.out.println("Verilen str'da 3. e indexi: "+ucuncuE);
                }
            }
        }
    }
}
