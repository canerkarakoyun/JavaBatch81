package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // indexOf methodu bana int bir deger donduruyor
                                            // int'de 'yok' diye bir deger yok
                                            // eger "-" bir deger donerse aradigimiz degerin olmadigini anlariz
                                            // bu noktada Java bu donusu -1 olarak sabitlemistir.
                                            // indexOf'a cevap -1 donerse anlayin ki aradiginiz yok

        String str5="srdgdsfhgsdfhdsfg;asodiv[df'ovn dsafg[ha0s9ygfhwk'f'oianr's";
        // str5'de 't' harfi kullanilmis midir?

        if (str5.indexOf(" ")==-1){
            System.out.println("str5'de istenen karakter kullanilmamistir");
        } else {
            System.out.println("str5'de istenen karakter kullanilmistir");
        }


    }
}
