import java.time.LocalDateTime;

public class DateTimeSample2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime= LocalDateTime.of(2025,1,13,16,4,30,9999);
        System.out.println("現在の日付："+localDateTime);
        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int dayOfMonth = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println("年："+year);
        System.out.println("月："+month);
        System.out.println("日："+dayOfMonth);
        System.out.println("時間："+hour);
        System.out.println("分："+minute);
        System.out.println("秒："+second);
    }
}
