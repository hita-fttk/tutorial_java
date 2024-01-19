package ObjectOrientation;

public class Ex12ElectricCar {
    int battery;
    boolean power;

    public void powerOn(){
        if(battery <=0){
            System.out.println("充電してください");
            return;
        }
        power = true;
    }
    public void powerOff(){
        power = false;
    }
    public void chargeToFull(){
        battery = 100;
    }
    public void move(String place){
        if(!power){
            System.out.println("電源を入れてください");
            return ;
        }
        System.out.println(place + "へ移動しました。");
        battery -= 50;
        if(battery <= 0){
            battery = 0;
            power = false;
        }
    }
}
