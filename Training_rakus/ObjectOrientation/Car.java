package ObjectOrientation;

public class Car {
    public int speed = 0;
    private String name;
    private int gasoline;

    Car(){}

    Car(int speed, String name, int gasoline){
        this.speed = speed;
        this.name = name;
        this.gasoline = gasoline;
    }

    public void stepOnAccele(){
        this.speed +=10;
        this.gasoline -= 10; 
    }
    public void stepOnBrake(){
        this.speed -= 10;
    }
    public void refuel(int newGasoilne){
        this.gasoline += newGasoilne; 
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.println("「"+this.name+"の速度は"+this.speed+"km/hでガソリン残量は"+this.gasoline+"リットルです」");
    }
}
