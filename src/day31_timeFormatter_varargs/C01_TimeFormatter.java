package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih : "+tarihSaat);
        // Ilk olusturulan tarih : 2022-08-02T11:49:59.693540900

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf1.format(tarihSaat)); // 02/8/22 11:53

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat)); // 2/Ağu/2022 11:54

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d/MMMM/yyyy HH:mm a");
        System.out.println(dtf3.format(tarihSaat)); // 2/Ağustos/2022 11:58 ÖÖ
    }
}
