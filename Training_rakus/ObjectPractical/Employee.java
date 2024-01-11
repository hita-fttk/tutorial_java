package ObjectPractical;

public class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return this.salary;
    }
}
