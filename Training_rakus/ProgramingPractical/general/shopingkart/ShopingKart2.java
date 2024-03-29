package shopingkart;

import java.util.ArrayList;
//このクラスはArrayList<Item>型の配列を継承した。
public class ShopingKart2 extends ArrayList<Item> {
    

    public int getTotalPrice(){
        int totalPrice = 0;
        for(int i=0; i<this.size(); i++){
            totalPrice += this.get(i).getPrice();
        }
        return totalPrice;
    }

    public double getAverage(){
        return this.getTotalPrice()/this.size();
    }
}
