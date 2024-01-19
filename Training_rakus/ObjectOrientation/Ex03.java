package ObjectOrientation;

public class Ex03 {
    public static void main(String[] args) {
        Human human1 = new Human("山田","太郎",0);
        human1.sayMyName();
        human1.eat("おにぎり");
        Human human2 = new Human("島田","優",0);
        human2.sayMyName();
        human2.eat("カレー");
    }
}
