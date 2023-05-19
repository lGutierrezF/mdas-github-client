package mdas.github.client.application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public final class MonthConstraintsCalculator {
    public MonthConstraintsCalculator() {
    }
    public List<LocalDate> execute(String stringMonth, String stringYear){
            List<LocalDate> monthConstraints = new ArrayList<>();

            // Get the year and month of the current date
            int year = Integer.parseInt(stringYear);
            int month = Integer.parseInt(stringMonth);

            // Create a YearMonth object for the current year and month
            YearMonth yearMonth = YearMonth.of(year, month);

            // Calculate the start date of the month
            LocalDate startDate = yearMonth.atDay(1);

            // Calculate the end date of the month
            LocalDate endDate = yearMonth.atEndOfMonth();
            monthConstraints.add(startDate);
            monthConstraints.add(endDate);
            return monthConstraints;
        }

}
