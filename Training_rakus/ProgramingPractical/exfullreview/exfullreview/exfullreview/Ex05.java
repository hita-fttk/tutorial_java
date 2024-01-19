package exfullreview;

public class Ex05 {
    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;
        int total = 0;
        while(true){
            if(f0 > 1000){
                break; 
            }
            total = f0+f1;
            f0 = f1;
            f1 = total;
            System.out.print(f0+" ");
        }
    }
}
