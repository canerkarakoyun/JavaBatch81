package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTeyCatch {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_Exceptions/Test.txt");

            while ((k=fis.read()) !=-1){
                System.out.print ((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi veya bozuk");
        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okunamadi");
        }

    }
}
