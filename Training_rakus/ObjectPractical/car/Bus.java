package car;

public class Bus extends Car {
    protected int price;

    public Bus(int speed, String name){
        super(speed,name);
    }
    public void stepOnAccele(){
        super.stepOnAccele();
        this.price +=30;
        System.out.println("料金は"+this.price+"円です");
    }
    
}
