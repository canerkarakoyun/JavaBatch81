package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // Iki tarih arasindaki sureyi bulma

        LocalDate tarih1=LocalDate.of(1983,7,30);
        LocalDate tarih2=LocalDate.now();

        Period period=Period.between(tarih1,tarih2);
        System.out.println(period);
        System.out.println(period.getYears());
    }
}
