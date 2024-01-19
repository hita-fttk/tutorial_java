import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample4 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("現在の日付："+localDate);
        System.out.println("月末は"+localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("次の水曜日は"+localDate.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));

        LocalTime localTime = LocalTime.now();
        System.out.println("現在の時刻："+localTime);
        // System.out.println("現在の時刻："+localTime.with(TemporalAdjusters.lastDayOfMonth()));
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("現在の日付と時刻："+localDateTime);
        System.out.println("月末は："+localDateTime.with(TemporalAdjusters.lastDayOfMonth()));

    }
}
