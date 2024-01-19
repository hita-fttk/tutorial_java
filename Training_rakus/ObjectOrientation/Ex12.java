package ObjectOrientation;

public class Ex12 {
    public static void main(String[] args) {

        Ex12ElectricCar car = new Ex12ElectricCar();
        car.chargeToFull();
        car.powerOn();
        car.move("埼玉");
        car.move("東京");
        car.move("茨城");
        car.powerOn();

    }
}
