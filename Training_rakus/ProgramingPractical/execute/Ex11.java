import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex11 {
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.of(2020,7,24);
        System.out.println("東京オリンピックの開催日");
        System.out.println(localDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = localDate.format(formatter);
        String dayOfWeek = localDate.getDayOfWeek().toString();
        System.out.println(format+outDayOfWeek(dayOfWeek));

        System.out.println("自分の誕生日");
        LocalDate localDate2 = LocalDate.of(1996,5,22);
        String myBirthDayOfWeek = localDate2.getDayOfWeek().toString();
        String myBirthDay = localDate2.format(formatter);
        System.out.println(myBirthDay+outDayOfWeek(myBirthDayOfWeek));
    }
    public static String outDayOfWeek(String dayOfWeek){
        switch (dayOfWeek) {
            case "MONDAY":
                return "(月)";
            case "TUESDAY":
                return "(火)";
            case "WEDNESDAY":
                return "(水)";
            case "THESDAY":
                return "(木)";
            case "FRIDAY":
                return "(金)";
            case "SATURDAY":
                return "(土)";
            case "SUNDAY":
                return "(日)";
            default:
                return "";
        }
    }
}
