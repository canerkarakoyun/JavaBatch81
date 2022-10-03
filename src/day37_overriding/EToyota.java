package day37_overriding;

public class EToyota extends DAraba{

    @Override
    void marka(){
        /* super.marka();
        eger hem overriden hem de overriding method'un calismasini istiyorsak
        ilk satira super.marka(); yazabiliriz.. zorunlu degil.
         */
        System.out.println("Markamiz Toyota");
    }

    void motor(){
        System.out.println("Toyota araclar toyota marka motor kullanir");
    }
}
