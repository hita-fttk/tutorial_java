package ObjectOrientation;

public class Ex10 {
    public static void main(String[] args) {
        int[] numbers = {5,6,1,3,9};
        int evenCount = 0;
        int maxNum = 0;
        int minNum = 0;
        System.out.println(numbers[3]);

        for(int number : numbers){
            System.out.print(number+" ");
        }
        System.out.println();
        for(int i=numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] %2 != 0){
                System.out.print(numbers[i]+" ");
            }
        }
        System.out.println();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] %2 == 0){
                evenCount++;
            }
        }
        System.out.println(evenCount);

        for(int t=0; t<numbers.length; t++){
            if(t == 0){
                minNum = numbers[t];
            }
            if(numbers[t] > maxNum){
                maxNum = numbers[t];
            }
            if(numbers[t] < minNum){
                minNum = numbers[t];
            }
        }
        System.out.println("最大値："+maxNum+"/最小値："+ minNum);
        



        
    }
}
