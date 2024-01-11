package ObjectPractical;

public abstract class Mammmalian {
    private String name;
    static final String TYPE = "哺乳類";

    public void showType(){
        System.out.println("哺乳類です");
    }

    abstract public void eat();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
