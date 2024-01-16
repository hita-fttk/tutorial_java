import shopingkart.Book;
import shopingkart.CD;
import shopingkart.DVD;
import shopingkart.Item;
import shopingkart.ShopingKart;

public class Main {
    public static void main(String[] args) {
        Item book1 = new Book("aaa",250);
        Item book2 = new Book("bbb",450);
        Item cd1 = new CD("fff",300);
        Item cd2 = new CD("ggg",500);
        Item cd3 = new CD("hhh",600);
        Item dvd1 = new DVD("ttt",2000);
        Item dvd2 = new DVD("nnn",2500);

        ShopingKart shopingKart = new ShopingKart();
        shopingKart.addItem(book1);
        shopingKart.addItem(book2);
        shopingKart.addItem(cd1);
        shopingKart.addItem(cd2);
        shopingKart.addItem(cd3);
        shopingKart.addItem(dvd1);
        shopingKart.addItem(dvd2);
        System.out.println("カート内の商品の個数は"+shopingKart.getItemSize()+"個です");
        System.out.println("カート内の合計金額は"+shopingKart.getTotalPrice()+"円です");
        System.out.println("カート内の平均金額は"+shopingKart.getAverage()+"円です");
    }
}
