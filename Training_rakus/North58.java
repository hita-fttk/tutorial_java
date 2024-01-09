import java.util.Random;

public class North58 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] intArray = new int[10];
        //1~100までの乱数を出力する
        for(int i=0; i<10; i++){
            int randomNumber = (int) (random.nextInt(101)+1);
            intArray[i] = randomNumber;
            // System.out.print(intArray[i]+" ");
        }
        //バブルソートを行う
        for(int k=0; k<intArray.length; k++){
            for(int j=0; j<intArray.length-1-k; j++){
                if(intArray[j] > intArray[j+1]){
                    int temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for(int l=0; l<10; l++){
            System.out.print(intArray[l]+" ");
        }
    }
}
