import java.time.LocalDateTime;

public class DateTimeSample3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 13, 17, 19, 33,999999);
        System.out.println("現在の日付："+localDateTime);
        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plusMonths(1);
        localDateTime = localDateTime.plusDays(1);
        localDateTime = localDateTime.plusHours(1);
        
        System.out.println("進めた後の日付："+localDateTime);
        localDateTime = localDateTime.minusYears(2);
        localDateTime = localDateTime.minusMonths(2);
        localDateTime = localDateTime.minusDays(2);
        localDateTime = localDateTime.minusHours(2);
        System.out.println("戻した後の日付："+localDateTime);

    }
}
