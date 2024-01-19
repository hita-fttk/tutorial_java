package execute;

import rpg.Hero;
import rpg.Slime;

public class Ex09 {
    public static void main(String[] args) {
        Hero hero = new Hero(20,"ロト");
        hero.show();
        hero.showHp();
        System.out.println();

        Slime slime = new Slime(10,"メタルスライム");
        slime.show();
        slime.showHp();
        System.out.println();
        slime.attack(hero);
        slime.talk("ぽよよ～ン。");
        System.out.println();

        hero.attack(slime);
    }
}
