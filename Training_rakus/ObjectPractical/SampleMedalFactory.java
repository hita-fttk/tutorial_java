package ObjectPractical;

public class SampleMedalFactory {
    Employee[] employees;
    Medal medal;
    public Medal[] makeMedal(Material[] materials,Employee[] employees){
        Medal[] medals = new Medal[materials.length] ;
        int totalSaraly=0;
        for(Employee employee : employees){
            totalSaraly += employee.getSalary();
        }
        for(int i =0; i<materials.length; i++){
            if(materials[i].getName().equals("金")){
                medal.setName("金メダル");
                medal.setPrice((int)(10000+(totalSaraly/materials.length)*1.2));
                medals[i] = medal;
                continue;
            }else if(materials[i].getName().equals("銀")){
                medal.setName("銀メダル");
                medal.setPrice((int)(5000+(totalSaraly/materials.length)*1.2));
                medals[i] = medal;
                continue;
            }else if(materials[i].getName().equals("銅")){
                medal.setName("銅メダル");
                medal.setPrice((int)(1000+(totalSaraly/materials.length)*1.2));
                medals[i] = medal;
                continue;
            }else{
                medal.setName("不良品");
                medal.setPrice(0);
                medals[i] = medal;
                continue;
            }
        }
        return medals;
    }
}
