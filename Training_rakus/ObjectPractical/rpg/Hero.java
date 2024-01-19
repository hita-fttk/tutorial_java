package rpg;

public class Hero extends Character implements Appear{
    public Hero(int hp, String name){
        super(hp,name);
    }
    public void show(){
        System.out.println("勇者"+this.getName()+"の登場！");
    }
}
