package day17_nestedForLoop;

public class C01_nestedForLoopTEKRARBAK {
    public static void main(String[] args) {
        // verilen string'deki kullanilan harfleri tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yapalim.

        String input="Java her zaman guzel";

        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W", ""); // Javaherzamanguzeldir
        System.out.print(islenecekKelime.substring(0,1));                   // J
        benzersizInput+=islenecekKelime.substring(0,1);                     // J

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("input: "+ input);
        System.out.println("benzersiz input: "+benzersizInput);
        System.out.println("Kelimede verilen fakli harf sayisi: "+benzersizInput.length());
    }
}
