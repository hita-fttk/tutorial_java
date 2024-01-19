package ProgramingIntroduction;
public class Training48 {
    public static void main(String[] args) {
        System.out.println(amount(11));
    }
    static int amount(int i){
        int total=0;
        for(int t=1; t<=i; t++){
            total +=t;
        }
        return total;
    }
}
