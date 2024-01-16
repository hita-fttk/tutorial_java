import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1996,5,22);
        System.out.println("私の誕生日は"+localDate.getYear()+"年"+localDate.getMonthValue()+"月"+localDate.getDayOfMonth()+"日です");
    }
}
