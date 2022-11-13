package Chapter3CoreJavaApis;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

public class LocalDateTimeExamples {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021,4,30);
//        LocalDate localDate1 = LocalDate.of(2021,4,31);
//        LocalDate localDate2 = LocalDate.of(2021,2,29);
        LocalDate local = LocalDate.of(2018, Month.APRIL, 30);
        local=  local.plusDays(2);
        System.out.println(local);
        System.out.println(true^false);
    }
}

