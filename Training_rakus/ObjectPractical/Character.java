package ObjectPractical;

public class Character {
    private int hp;
    private String name;

    Character(int hp, String name){
        this.hp = hp;
        this.name = name;
    }
    public void showHp(){
        System.out.println(this.name+"の現在のHP："+this.hp);
    }
    public void attack(Character character){
        System.out.println(this.name+"のこうげき！");
        character.hp -=5;
        character.showHp();
    }

    public void downHp(int hp){
        if(this.hp-hp >0){
            this.hp -= hp;
        }else{
            this.hp = 0;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setName(String name){
        this.name = name;
    }
}
