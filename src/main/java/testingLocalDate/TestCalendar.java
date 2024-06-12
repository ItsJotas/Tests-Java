package testingLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2024, 6 - 1, 1);
        Date date1 = cal.getTime();
        System.out.println(date1);

        cal.clear();
        cal.set(2024, 6, 1);
        cal.add(Calendar.MILLISECOND, -1);
        Date date2 = cal.getTime();
        System.out.println(date2);

        LocalDateTime localDate1 = LocalDateTime.of(2024, 6, 1, 0, 0, 0);
        System.out.println(localDate1);

        LocalDateTime localDate2 = LocalDateTime.of(2024, 6 + 1, 1, 0, 0, 0)
                .minus(1, ChronoUnit.MILLIS);
        System.out.println(localDate2);
    }
}
