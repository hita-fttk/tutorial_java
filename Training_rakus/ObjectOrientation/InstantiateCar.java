package ObjectOrientation;

public class InstantiateCar {
    public static void main(String[] args) {
        Car car = new Car(0,"エスティマ",0);

        

        car.stepOnAccele();
        car.stepOnAccele();
        car.stepOnBrake();

        System.out.println("現在の速度は"+car.speed+"kmです。");
    }
}
