package ObjectPractical;

public class Hero extends Character implements Appear{
    Hero(int hp, String name){
        super(hp,name);
    }
    public void show(){
        System.out.println("勇者"+this.getName()+"の登場！");
    }
}
