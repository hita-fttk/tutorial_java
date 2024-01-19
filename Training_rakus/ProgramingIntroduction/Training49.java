package ProgramingIntroduction;

public class Training49 {
    public static void main(String[] args) {
        System.out.println(calcTax(2000));
        System.out.println(calcIncludTax(2000));
        System.out.println(calcHalfPrice(2000));
        System.out.println(calcTimeServicePrice(2000, 0.8));
    }
    static int calcTax(int price){
        return ((int)(price*0.1));
    }
    static int calcIncludTax(int price){
        return price+calcTax(price);
    }
    static int calcHalfPrice(int price){
        return ((int)(price/2));
    }
    static int calcTimeServicePrice(int price, double discountRate){
        return (int)(price-(price*(1-discountRate)));
    }
}
