package execute;

import car.Bus;

public class Ex01 {
    public static void main(String[] args) {
        Bus bus = new Bus(10,"aaa");
        
        bus.stepOnAccele();
        bus.stepOnBrake();
        bus.stepOnBrake();
        bus.stepOnAccele();
    }
}
