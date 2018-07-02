package Programmers.Java8;

import java.time.LocalDate;

public class DayName {
    public String getDayName(int a, int b)
    {
        LocalDate date = LocalDate.of(2016, a, b);
        return date.getDayOfWeek().toString().substring(0,3);
    }
}
