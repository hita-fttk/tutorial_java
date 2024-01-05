public class Training15 {
    public static void main(String[] args) {
        int item1 = 500;int item2 = 350;int taxRate=10;
        int subTotal = item1*4+item2*8;
        int tax = (item1*4+item2*8)*taxRate/100;
        System.out.println("小計金額");
        System.out.println(subTotal+"円");
        System.out.println("消費税");
        System.out.println(tax+"円");
        System.out.println("合計金額");
        System.out.println(subTotal+tax+"円");
    }
}
