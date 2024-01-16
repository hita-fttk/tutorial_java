import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TrainCalender {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, 3, 1);
        int firstDate = localDate.getDayOfMonth();
        System.out.println(firstDate);
        System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()));
        LocalDate lastDateMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        int lastDate = lastDateMonth.getDayOfMonth();
        System.out.println(lastDate);
        System.out.println(lastDateMonth.getDayOfMonth());
        System.out.println(localDate);
        String dayOfWeek = localDate.getDayOfWeek().toString();
        System.out.println(dayOfWeek);
        System.out.println(localDate.minusDays(1).getDayOfWeek());

        System.out.println(localDate.getYear() + "年" + localDate.getMonthValue() + "月のカレンダー");
        System.out.println("日\t月\t火\t水\t木\t金\t土");
        int count = 0;
        //一回しか処理しないためにカウント変数を定義している
        int dayCount = 1;
        for (int i = firstDate; i <= lastDate; i++) {
            if (dayCount == 1) {
                if (dayOfWeek.equals("SUNDAY")) {
                    count=0;
                    dayCount = 2;
                } else if (dayOfWeek.equals("MONDAY")) {
                    System.out.print("■\t");
                    count =1;
                    dayCount = 2;
                } else if (dayOfWeek.equals("TUESDAY")) {
                    System.out.print("■\t■\t");
                    count=2;
                    dayCount = 2;
                } else if (dayOfWeek.equals("WEDNESDAY")) {
                    System.out.print("■\t■\t■\t");
                    count=3;
                    dayCount = 2;
                } else if (dayOfWeek.equals("THURSDAY")) {
                    System.out.print("■\t■\t■\t■\t");
                    count=4;
                    dayCount = 2;
                } else if (dayOfWeek.equals("FRIDAY")) {
                    System.out.print("■\t■\t■\t■\t■\t");
                    count=5;
                    dayCount = 2;
                } else if (dayOfWeek.equals("SATURDAY")) {
                    System.out.print("■\t■\t■\t■\t■\t■\t");
                    count=6;
                    dayCount = 2;
                }
            }
            count++;
            System.out.print(i + "\t");
            if (count == 7) {
                System.out.println();
                count = 0;
            }
        }
        if(count!=0){
            for(int t=7; t>count;t--){
                System.out.print("■\t");
           }
    }
    }
}
// localDate.with(TemporalAdjusters.lastDayOfMonth());
