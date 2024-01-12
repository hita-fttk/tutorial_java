package ObjectPractical;

public class Ex10 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("山田",200000);
        Employee employee2 = new Employee("海田",220000);
        Employee employee3 = new Employee("川田",240000);
        Employee[] employees = {employee1,employee2,employee3};
        Material material1 = new Material("金",10000);
        Material material2 = new Material("銀",5000);
        Material material3 = new Material("銅",1000);
        Material material4 = new Material("木",500);
        Material[] materials = {material1,material2,material3,material4};

        MedalFactory medalFactory = new MedalFactory();
        Medal[] medals = medalFactory.makeMedal(materials,employees);
        // System.out.println(medals.length);// makeMedalメソッドの戻り値であるmedalsのlengthは4
        //★\tで表記をそろえられることを知った。
        for(int i=0; i<medals.length; i++){
            System.out.println("製品名:"+medals[i].getName()+"\t価格:"+medals[i].getPrice()+"円");
        }
        // System.out.println(medalFactory.makeMedal(materials,employees));

    }
}
