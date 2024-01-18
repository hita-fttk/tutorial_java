package exfullreview;

import java.time.LocalDate;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020,7,24);
        System.out.print("東京オリンピックの開会式の曜日");
        System.out.println(localDate.getDayOfWeek());
        LocalDate localDate2 = LocalDate.of(1996,5,22);
        System.out.print("私の誕生日の曜日：");
        System.out.println(localDate2.getDayOfWeek());
    }
}
