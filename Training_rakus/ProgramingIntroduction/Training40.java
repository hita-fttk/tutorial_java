package ProgramingIntroduction;
public class Training40 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int t = 1; t <= 4; t++) {

                System.out.print("*");
                if (t == i) {
                    break;
                }
            }
            System.out.println();
        
            }
            for(int s=1; s<=3; s++){
                for(int k=3; k>=1; k--){
                    System.out.print("*");
                    if(k==s){
                        break;
                    }
                }
                System.out.println();
            }
        }
    }
