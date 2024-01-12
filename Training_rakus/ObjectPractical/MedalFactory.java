package ObjectPractical;

public class MedalFactory {
    Employee[] employees;
    // Medal medal = new Medal("a", 1); //1⃣この行に記載していては全て不良品になってしまった。
    public Medal[] makeMedal(Material[] materials,Employee[] employees){
        Medal[] medals = new Medal[materials.length] ;
        int totalSaraly=0;
        for(Employee employee : employees){
            totalSaraly += employee.getSalary();
        }
        for(int i =0; i<materials.length; i++){
             Medal medal = new Medal("a", 1);//1⃣この行に記載すると正しく反映された。なぜなのか分からない。
            if(materials[i].getName().equals("金")){
                medal.setName("金メダル");
                medal.setPrice((int)(materials[i].getCost()+(totalSaraly/materials.length)*1.2));
                medals[i] = medal;//2⃣ここの記載有無は35行目を消すとエラーになる。。
                // continue;
            }else if(materials[i].getName().equals("銀")){
                medal.setName("銀メダル");
                medal.setPrice((int)(materials[i].getCost()+(totalSaraly/materials.length)*1.2));
                medals[i] = medal;//2⃣ここの記載有無は35行目を消すとエラーになる。
                // continue;
            }else if(materials[i].getName().equals("銅")){
                medal.setName("銅メダル");
                medal.setPrice((int)(materials[i].getCost()+(totalSaraly/materials.length)*1.2));
                // medals[i] = medal;//2⃣ここの記載有無は35行目を消すとエラーになる。
                // continue;
            }else{
                medal.setName("不良品");
                medal.setPrice(0);
                medals[i] = medal;//2⃣ここの記載有無は35行目を消すとエラーになる。
                // continue;
            }
            medals[i] = medal;//2⃣ここの記載と各if文のmedals[i] = medalは対応している。
        }
        return medals;
    }
}
