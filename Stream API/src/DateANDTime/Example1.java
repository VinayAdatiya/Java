package DateANDTime;

import java.time.LocalDate;
import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {
        //LocalDate Class
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date :- "+currentDate);

        //parse from string
        String dateEx = "2024-01-01";
        LocalDate customDate  = LocalDate.parse(dateEx);
        System.out.println("Parsed Date :- "+customDate);

        //from year , date and month
        LocalDate customDate2 = LocalDate.of(2025,11,1);
        System.out.println("Date from value of year, month and dayofmonth"+customDate2);

        // now() , minusDays() , plusDays()
        System.out.println("Yesterday :- "+currentDate.minusDays(1));
        System.out.println("Tomorrow :- "+currentDate.plusDays(1));

        // isLeapYear()
        System.out.println(currentDate+ " is leap year :- "+currentDate.isLeapYear());

        //atTime()
        System.out.println("Date and Time using atTime() :- "+currentDate.atTime(12,30));
    }
}
