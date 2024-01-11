package ObjectPractical;

public class Ex05 {
    public static void main(String[] args) {
        Car car = new Car(0,"エスティマ");
        car.setName("prius");
        car.setSpeed(50);
        System.out.println("現在のスピード："+car.getSpeed());
        System.out.println("名前："+car.getName());
    }
}
