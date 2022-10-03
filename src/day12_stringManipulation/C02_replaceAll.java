package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        // str'i Bugun Java cok guzel haline getirin
        // replaceAll ( ) method'undaki All'un amaci ayni ozellikteki tum karakterleri kapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil desek 2 adimda bu str'i temizlemis oluruz

        // tum ozel karakterleri silelim dedigimizde spaceler de siliniyor, space'leri korumak icin en basta onlarin
        // yerine cumlede bulunmayacak bir string koyalim
        // "qazwsx"

        str=str.replaceAll(" ", "qazwsx");
        System.out.println(str); // 1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el

        str=str.replaceAll("\\W", ""); // 1Bu2gu3nJavacokg3uzel
        System.out.println(str);

        str=str.replaceAll("\\d", "");
        System.out.println(str);
        // istenmeyen ozel karakter ve sayilardan  kurtulduk
        // simdi spaceleri geri getirelim

        str=str.replace("qazwsx", " ");
        System.out.println(str );
    }
}
