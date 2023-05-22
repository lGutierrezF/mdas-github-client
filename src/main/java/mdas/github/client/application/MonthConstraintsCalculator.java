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

            int year = Integer.parseInt(stringYear);
            int month = Integer.parseInt(stringMonth);

            YearMonth yearMonth = YearMonth.of(year, month);

            LocalDate startDate = yearMonth.atDay(1);

            LocalDate endDate = yearMonth.atEndOfMonth();
            monthConstraints.add(startDate);
            monthConstraints.add(endDate);
            return monthConstraints;
        }

}
