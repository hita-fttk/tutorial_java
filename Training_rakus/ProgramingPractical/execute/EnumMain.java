public class EnumMain {
    public static void main(String[] args) {
        Month month = Month.of(7);
        System.out.println(month.getJapanese());
        System.out.println(month.getDescription());
        System.out.println(month.getEvent());
        month = Month.of(12);
        System.out.println(month.getJapanese());
        System.out.println(month.getDescription());
        System.out.println(month.getEvent());

    }
}
