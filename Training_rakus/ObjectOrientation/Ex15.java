package ObjectOrientation;

public class Ex15 {
    public static void main(String[] args) {
        Ex15Bicycle bicycle = new Ex15Bicycle();
        bicycle.setBearing("北");
        bicycle.turnLeft();
        bicycle.turnRight();
        bicycle.turnLeft();
        bicycle.turnLeft();
        bicycle.turnRight();
        bicycle.turnLeft();
        bicycle.display();
    }
}
