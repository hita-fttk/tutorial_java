package ObjectPractical;

public class Car {
    private int speed;
    private String name;
    
    Car(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    public void stepOnAccele(){
        this.speed += 10;
        System.out.println("スピードが"+this.speed+"に増えました");
    }
    public void stepOnBrake(){
        this.speed -= 10;
        System.out.println("スピードが"+this.speed+"に減りました");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
}
