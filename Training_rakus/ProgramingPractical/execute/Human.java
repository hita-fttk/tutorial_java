public class Human {
    private String name;
    private int age;
    private String birthplace;

    Human(String name, int age, String birthplace){
        this.name = name;
        this.age = age;
        this.birthplace = birthplace;
    }
    @Override
    public String toString(){
        return "Human [name="+this.name+",age="+this.age+",birthplace="+this.birthplace+"]";
    }
}
