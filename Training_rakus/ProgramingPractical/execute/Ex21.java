import java.util.HashMap;
import java.util.Map;

public class Ex21 {
    public static void main(String[] args) {
        Map<String,String> prefectures = new HashMap<>();
        prefectures.put("東京","東京");
        prefectures.put("埼玉","さいたま");
        prefectures.put("茨城","水戸");
        prefectures.put("沖縄","那覇");
        System.out.println("埼玉の県庁所在地は「"+prefectures.get("埼玉")+"」です");
        System.out.println("沖縄の県庁所在地は「"+prefectures.get("沖縄")+"」です"); 
    }
}
