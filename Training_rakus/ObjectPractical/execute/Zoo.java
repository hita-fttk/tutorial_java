package execute;

import animal.Animal;
import animal.Bear;
import animal.Goat;
import animal.Horse;
import animal.Monkey;
import animal.Sheep;

public class Zoo {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        Animal horse = new Horse();
        Animal goat = new Goat();
        Animal monkey = new Monkey();
        Bear bear = new Bear();
        Animal[] animals = {sheep,horse,goat,monkey,bear};
        for(Animal animal : animals){
            animal.cry();
        }
    }
}
