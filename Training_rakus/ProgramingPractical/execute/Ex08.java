import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 2,1);
        System.out.println(localDate);
        localDate = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(localDate);
        int day = localDate.getDayOfMonth();
        System.out.println(day);
    }
}
