package ObjectOrientation;

public class Human {
    private String lastName;
    private String firstName;
    int power;
    Human(){}

    Human(String lastName, String firstName, int power){
        this.lastName = lastName;
        this.firstName = firstName;
        this.power = power;
    }

    public void sayMyName(){
        System.out.println("私の名前は"+this.lastName+this.firstName+"です。");
    }

    public void eat(String food){
        if(food.equals("おにぎり")){
            this.power +=10;
        }else if(food.equals("カレー")){
            this.power += 20;
        }else{
            this.power += 5;
        }
        System.out.println("パワーは"+this.power+"になりました。");
    }

    public String toString(){
        return this.lastName+this.firstName+"さんのパワーは"+this.power+"です";
    }
}
