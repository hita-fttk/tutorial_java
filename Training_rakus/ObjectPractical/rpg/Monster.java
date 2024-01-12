package rpg;

public class Monster extends Character implements Appear {
    public Monster(int hp, String name){
        super(hp,name);
    }
     public void show(){
        System.out.println(this.getName()+"が現れた！");
     }
}
