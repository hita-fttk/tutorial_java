package ObjectOrientation;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for(int i=0; i<numbers.length;i++){
            System.out.println(i+1+"番目の数字");
            numbers[i] = scanner.nextInt();
        }
        int[] num = {42,54,32,8,7,35,71,13,21,45};

        for(int number : numbers){
            // int num = number*2;
            System.out.print(number*2+" ");
            // System.out.println();
        }
        System.out.println();

        System.out.print("偶数");
        for(int n : num){
            if(n%2 == 0){
                System.out.print(n+" ");
            }
        }
        System.out.println();
        System.out.print("奇数");
        for(int n : num){
            if(n%2 != 0){
                System.out.print(n+" ");
            }
        }


    }
}
