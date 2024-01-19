package ObjectOrientation;

public class Ex02 {
    public static void main(String[] args) {
        Car estima = new Car(50,"エスティマ",0);
        Car prius = new Car(30,"プリウス",0);

        estima.stepOnAccele();
        estima.stepOnAccele();
        estima.stepOnBrake();

        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnBrake();
        prius.stepOnBrake();
        prius.stepOnBrake();
        prius.stepOnBrake();

        System.out.println(estima.getName()+"の現在の速度は"+estima.speed+"km/hです。");
        System.out.println(prius.getName()+"の現在の速度は"+prius.speed+"km/hです。");
    }
}
