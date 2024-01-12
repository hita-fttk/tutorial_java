package medal;

public class Medal {
    private String name;
    Material material;
    Employee employee;
    private int price;

    Medal(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
}
