package exfullreview;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex09 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int day = Integer.parseInt(args[2]);
        int hour = Integer.parseInt(args[3]);
        int minutes = Integer.parseInt(args[4]);
        int second = Integer.parseInt(args[5]);
        LocalDateTime localDateTime = LocalDateTime.of(year,month,day,hour,minutes,second);
        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plusMonths(2);
        localDateTime = localDateTime.plusDays(3);
        localDateTime = localDateTime.plusHours(4);
        localDateTime = localDateTime.plusMinutes(5);
        localDateTime = localDateTime.plusSeconds(6);
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"時"+minutes+"分"+second+"秒の1年2か月3日4時間5分6秒後は");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日hh時mm分ss秒");
        String format = localDateTime.format(formatter);
        System.out.println(format);

        
    }

}
