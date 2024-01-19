package shopingkart;

import java.util.ArrayList;


public class ShopingKart {
    //ArrayList<Item>型の変数itemListを定義（箱を用意した。）
    private ArrayList<Item> itemList;
    public ShopingKart(){
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
    }
    public int getItemSize(){
        return this.itemList.size();
    }
    public int getTotalPrice(){
        int totalPrice=0;
        for(Item item :this.itemList){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double getAverage(){
        return this.getTotalPrice()/this.getItemSize();
    }

    public void removeItem(int index){
        this.itemList.remove(index);
    }
}
