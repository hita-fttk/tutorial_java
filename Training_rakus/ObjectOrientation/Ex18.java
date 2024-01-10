package ObjectOrientation;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int[] array = new int[50];
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while(true){
            if(total>=100){
                break;
            }
            array[count] = scanner.nextInt();
            total += array[count]; 
            count++;
        }
        for(int i=0; i<count; i++){
            System.out.print(array[i]+" ");
        }
        scanner.close();
    }
}
