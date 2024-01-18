package exfullreview;

import java.util.Arrays;
import java.util.List;

public class Ex13Demo {
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(5,4,8,3,1);の記載は
        //List<Integer> numbers = new ArrayList<>();を省略した書き方
        List<Integer> list = Arrays.asList(5,4,8,1,7);
        // System.out.println(!list.contains(8));
        System.out.println(list.indexOf(1));
    }
}
