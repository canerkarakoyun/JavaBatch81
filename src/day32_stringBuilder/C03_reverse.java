package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        // verilen bir input'u tersine cevirip bize donduren bir method olusturun

        String input="Hey gidi for loop gunleri";

        String tersInput=tersineCevir(input);

        System.out.println(tersInput);

    }

    public static String tersineCevir(String input) {
        // gonderdigimiz inpit String, fakat string'de reverse methodu yok
        // bu yuzden StringBuilder'a donustirmemiz gerekiyor.

        StringBuilder sb=new StringBuilder(input);

        // StringBuilder'da inputu tersine cevirdik fakat return yaparken String olmasi
        // gerekecek. Bu yuzden sonuna .toString() methodu ekleyerek StringBuilder data
        // turunden String data turune donusturmus oluruz.

        return sb.reverse().toString();

    }
}
