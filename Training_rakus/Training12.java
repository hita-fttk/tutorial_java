public class Training12 {
    public static void main(String[] args) {
        int item1 = 500;
        int item2 = 350;
        System.out.println("小計金額");
        System.out.println(item1*4+item2*8);
        System.out.println("消費税");
        System.out.println((item1*4+item2*8)/10);
        System.out.println("合計金額");
        System.out.println(item1*4+item2*8+((item1*4+item2*8)/10));
    }
}
