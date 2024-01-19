import java.util.HashMap;
import java.util.Map;
/**
 * @param
 * @return 
 * @throws 
 * @author HigakiTaku
 */

public class Ex22 {
        public static void main(String[] args) {
        Map<String,String> prefectures = new HashMap<>();
        prefectures.put("東京","東京");
        prefectures.put("埼玉","さいたま");
        prefectures.put("茨城","水戸");
        prefectures.put("沖縄","那覇");
        prefectures.forEach((key,value) -> System.out.println(key + "の県庁所在地は"+ value+"です"));
    
    }
}

