import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeSample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("現在の日付："+localDate);
        
        LocalTime localTime = LocalTime.now();
        System.out.println("現在の時間："+localTime);
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("現在の時間："+localDateTime);
    }
}
