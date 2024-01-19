import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Ex10 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020,7,27);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(localDate);
        String format1 = localDate.format(formatter1);
        System.out.println(format1);
        // LocalDateTime localDate2 = LocalDateTime.parse(localDateTime,format);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format2 = localDate.format(formatter2);
        System.out.println(format2);
        String dayOfWeek = localDate.getDayOfWeek().toString();
        System.out.println(dayOfWeek);



    }
}
