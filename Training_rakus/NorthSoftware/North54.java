package NorthSoftware;
import java.util.Random;

public class North54 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sacArray = new int[100];
        int rangeNumber = 10;
        int totalScore = 0;
        int inputCount = 0;

        while(true){
            if(totalScore >100 || inputCount == 10){
                int[] ansArray = new int[inputCount];
                for(int i=0; i<inputCount;i++){
                    ansArray[i] = sacArray[i];
                }
                for(int k=0;k<ansArray.length;k++){
                    System.out.println(ansArray[k]);
                }
                break;
            }else{
                int randomNumber = (int) (random.nextDouble() * rangeNumber);
                sacArray[inputCount] = randomNumber;
                totalScore += randomNumber;
                inputCount++;
                System.out.print("合計数：");
                System.out.println(totalScore);
            }
        }
    }
}
