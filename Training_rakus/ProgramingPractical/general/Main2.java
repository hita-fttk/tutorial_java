import shopingkart.Book;
import shopingkart.CD;
import shopingkart.DVD;
import shopingkart.Item;
import shopingkart.ShopingKart2;

public class Main2 {
    public static void main(String[] args) {
        Item book1 = new Book("aaa",250);
        Item book2 = new Book("bbb",450);
        Item cd1 = new CD("fff",300);
        Item cd2 = new CD("ggg",500);
        Item cd3 = new CD("hhh",600);
        Item dvd1 = new DVD("ttt",2000);
        Item dvd2 = new DVD("nnn",2500);

        ShopingKart2 shopingKart2 = new ShopingKart2();
        shopingKart2.add(book1);
        shopingKart2.add(book2);
        shopingKart2.add(cd1);
        shopingKart2.add(cd2);
        shopingKart2.add(cd3);
        shopingKart2.add(dvd1);
        shopingKart2.add(dvd2);

        System.out.println("カート内の商品の個数は"+shopingKart2.size()+"個です");
        System.out.println("カート内の合計金額は"+shopingKart2.getTotalPrice()+"円です");
        System.out.println("カート内の平均金額は"+shopingKart2.getAverage()+"円です");

    }
}
