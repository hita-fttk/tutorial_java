package ObjectPractical;

public class startApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.showType();
        dog.setName("ポチ");
        System.out.println("私の名前は"+dog.getName()+"です");
        dog.eat();
        Cat cat = new Cat();
        cat.showType();
        cat.setName("タマ");
        System.out.println("私の名前は"+cat.getName()+"です");
        cat.eat();
        Human human = new Human();
        human.showType();
        human.setName("山田");
        System.out.println("私の名前は"+human.getName()+"です");
        human.eat();
        Mouse mouse = new Mouse();
        mouse.showType();
        mouse.setName("チュー");
        System.out.println("私の名前は"+mouse.getName()+"です");
        mouse.eat();

    }
}
