package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);


        System.out.println(tarih.getDayOfYear()); // 213 (yilin 213. gunu)
        System.out.println(tarih.getYear()); // 2022
        System.out.println(tarih.getDayOfWeek()); // MONDAY
        System.out.println(tarih.getMonthValue()); // 8
        System.out.println(tarih.isLeapYear()); // false (bu sene artik yil mi?)
        System.out.println(tarih.lengthOfMonth()); // 31

        LocalDate tarih2=LocalDate.of(1983, 7, 30);
        System.out.println(tarih2);
        System.out.println(tarih2.getDayOfWeek());

        LocalDate tarih3=LocalDate.of(1990, Month.JANUARY, 10);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100)); // 100 gun sonra 2022-11-09 olacakmis
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); // 5 yil, 3 ay, 12 gun sonra tarih 2027-11-13

        System.out.println(tarih.minusWeeks(20)); // 2022-03-14
        System.out.println(tarih.minusDays(100).minusMonths(5)); // 5 ay 100 gun once tarih 2021-11-23

        System.out.println(tarih.isAfter(tarih2)); // true

        // iki farkli dogum tarihi girildiginde
        // hangisinde doganin daha buyuk oldugunu bulunuz

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3+" tarihinde dogan daha buyuk");
        } else if (tarih2.isBefore(tarih3)){
            System.out.println(tarih2+" tarihinde dogan daha buyuktur");
        } else{
            System.out.println("Tarihler aynidir");
        }


    }
}
