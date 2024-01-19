import java.util.ArrayList;
import java.util.List;

public class Ex20 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("伊賀",30));
        employees.add(new Employee("山田",23));
        employees.add(new Employee("佐藤",40));
        employees.add(new Employee("田中",45));
        employees.remove(1);
        employees.add(1,new Employee("鈴木",45));
        System.out.println("3番目の社員は"+employees.get(2).getName()+"です");
        for(Employee element : employees){
            System.out.println(element.getName());
        }
    }
}
