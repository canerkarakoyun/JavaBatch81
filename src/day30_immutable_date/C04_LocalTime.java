package day30_immutable_date;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1); //00:00:09.382801300
        /*
        Bizim olusturdugumuz date ve time canli saat ya da tarih degildir
        LocalTime.now(); kullandigimiz satirda o anki tarih ve saati store eder
        time1 variable'inin degeri SABITTIR
         */

        Thread.sleep(3000);
        time1=LocalTime.now();

        System.out.println(time1); // 00:00:12.398179200

        System.out.println(time1.getSecond());
        System.out.println(time1.plusSeconds(10000));
        System.out.println(time1.minusMinutes(200));



    }
}
