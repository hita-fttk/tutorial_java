package ObjectOrientation;

public class Ex13VendingMachine {
    static final int PRICE = 120;
    int money;
    int stock;

    public void refillStock(int stock){
        if(this.stock >= 10){
            System.out.println("商品がいっぱいです");
            return ;
        }else{
            this.stock += stock;
            System.out.println("在庫が"+this.stock+"個になりました"); 
        }
    }
    public void putMoney(int money){
        this.money += money;
        System.out.println("入金金額が"+this.money+"円になりました");
    }
    public void buyItem(){
        if(this.stock<=0){
            System.out.println("在庫を追加してください");
        }else if(this.money <=0){
            System.out.println("お金を入れてください");
        }else if(this.money < this.PRICE){
            System.out.println("お金が足りません");
        }else{
            System.out.println("商品を購入しました");
            this.stock--;
            this.money -= this.PRICE;
        }
        if(this.stock == 0){
            System.out.println("在庫切れになりました");
        }
    }
}
