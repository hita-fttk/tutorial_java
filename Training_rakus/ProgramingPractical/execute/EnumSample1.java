public class EnumSample1 {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.THURSDAY.getKey());
        System.out.println(DayOfWeek.THURSDAY.getComment());

        // DayOfWeek dayOfWeek = DayOfWeek.of("水");
        DayOfWeek dayOfWeek = DayOfWeek.of("ｋ");
        System.out.println(dayOfWeek.getComment());
    }
}
