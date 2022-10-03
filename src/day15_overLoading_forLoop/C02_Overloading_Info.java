package day15_overLoading_forLoop;

public class C02_Overloading_Info {
    public static void main(String[] args) {
        /*
        Java'da olusturdugumuz method'ların isminin yaptigi islerle uyumlu olmasini isteriz
        Mesela bir stringin bir bolumunu almak icin Java
        2 adet subString() method'u veya
        verilen String'deki bazi parcalari yenileriyle degistirmek icin
        2 adet replace() method'u var

        Java aynı isimde birden fazla method varsa, hangisinin kullanılacagina parametre sayisi ve
        parametrelerin data turune gore karar verir

        Method'ları birbirinden ayıran unsurlara METHOD IMZASI denir
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);

        str.replace('c', 'v');
        str.replaceAll("J", "H");

        /*
        Ayni isimde farkli method'lar olusturabilmek icin degistirebilecegimiz seyler (signature'lar);

        1. Parametre sayisi
        2. Aynı sayida parametreye sahip olsa bile parametrelerin DATA TURLERINI degistirebiliriz,
        3. Ayni sayida ve ayni data turunde parametreleri olan method'larda parametrelerin siralanisi degistirilebilir.
         */
    }
}
