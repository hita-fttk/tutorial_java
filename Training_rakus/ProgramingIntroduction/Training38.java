package ProgramingIntroduction;
public class Training38 {
    public static void main(String[] args) {
        for(int i=10; i>=1; i--){
            for(int t=1; t<=10; t++){
                System.out.print("*");
                if(t==i){
                    break;
                }
            }
            System.out.println();
        }
    }
}
