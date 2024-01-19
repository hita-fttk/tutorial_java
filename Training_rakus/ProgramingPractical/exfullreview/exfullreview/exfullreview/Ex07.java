package exfullreview;

public class Ex07 {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        if(p<1 && p>20){
            throw new IndexOutOfBoundsException("1~20までの数字を入力してください");
        }
        for(int i=1; i<=p; i++){
            for(int t=1; t<=p; t++){
                System.out.print(i*t+" ");
            }
            System.out.println();
        }
    }
}
