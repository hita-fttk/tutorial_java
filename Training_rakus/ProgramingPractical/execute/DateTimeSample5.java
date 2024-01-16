import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSample5 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("現在の日付："+localDateTime);
        System.out.println("LocalTimeDateからフォーマットされた文字列へ変換");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");
        String format = localDateTime.format(formatter);
        System.out.println(format);
        System.out.println("==============================");
        System.out.println("文字列からLocalDateTimeへ変換");
        String strLocalDateTime = "2024/02/15 18:56:45";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(strLocalDateTime,formatter2);
        System.out.println("文字列から変換されたLocalDateTime:"+localDateTime2);
    }
}
