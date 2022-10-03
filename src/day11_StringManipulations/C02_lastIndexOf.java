package day11_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime="cok";

        /*
        verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz.
        - Verilen kelime cumlede kullanilmamis
        - Verilen kelime cumlede 1 kez kullanilmis
        - Verilen kelime cumlede birden fazla kez kullanilmis
         */
         int kelimeIlkIndex=cumle.indexOf(kelime);
         int kelimeSonIndex=cumle.lastIndexOf(kelime);

         if (kelimeIlkIndex==-1){
             System.out.println("Verilen kelime cumlede kullanilmamistir");
         } else if (kelimeSonIndex==kelimeIlkIndex){
             System.out.println("Verilen kelime cumlede 1 kez kullanilmistir");
         } else{
             System.out.println("Verilen kelime cumlede birden fazla kez kullanilmistir");
         }
    }
}
