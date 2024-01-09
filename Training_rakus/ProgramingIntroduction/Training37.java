package ProgramingIntroduction;
public class Training37 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int t=1; t<=10; t++){
                System.out.print("*");
                if(t == i){
                    break;
                }
            }
            System.out.println();
        }
    }
}
