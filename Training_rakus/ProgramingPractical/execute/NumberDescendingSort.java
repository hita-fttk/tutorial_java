import java.util.Comparator;

public class NumberDescendingSort implements Comparator<Integer> {
    @Override
    public int compare(Integer num1,Integer num2){
        if(num1>num2){
            return -1;
        }else if(num1 <num1){
            return 1;
        }else{
            return 0;
        }
    }
}
