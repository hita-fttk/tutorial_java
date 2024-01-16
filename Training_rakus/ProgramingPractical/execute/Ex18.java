

import java.util.ArrayList;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("伊賀");
        lists.add("山田");
        lists.add("佐藤");
        lists.add("田中");
        for(String element : lists){
            System.out.println(element);
        }
    }
}
