package ProgramingIntroduction;
public class Training33 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int t=1; t<=5; t++){
                System.out.print(t);
                if(t == i){
                    
                    break;
                }
            }
            System.out.println();
        }
    }
}
