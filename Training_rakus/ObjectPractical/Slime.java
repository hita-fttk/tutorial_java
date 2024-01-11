package ObjectPractical;

public class Slime extends Monster {
    Slime(int hp, String name){
        super(hp,name);
    }
    public void talk(String message){
        System.out.println(this.getName()+":"+message);
    }
}
