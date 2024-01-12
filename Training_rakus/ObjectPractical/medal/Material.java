package medal;

public class Material {
    private String name;
    private int cost;

    public Material(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setCost(int cost){
        this.cost = cost;
    }
    public int getCost(){
        return this.cost;
    }
}
