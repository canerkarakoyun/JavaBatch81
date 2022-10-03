package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat); // 2022-08-02T00:19:25.042609700

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // minus & plus bir arada

        System.out.println(tarihSaat.toLocalDate());


    }
}
