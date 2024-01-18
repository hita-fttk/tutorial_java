import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Speech {
    public static void main(String[] args) {
        String speech = "I am honored to be here today with you at the graduation ceremony of one of the finest universities in the world. Actually, I didn't graduate from university. And this is the closest experience I've ever had to a college graduation ceremony.Today, I would like to tell you three stories from my life. That's all. It's not a big deal. There are only three. I dropped out of Reed College after the first six months. However, I returned to the university after about a year and a half and remained there as a student until I actually quit the university. So why did I quit university?";
        speech = speech.replace(".","");
        speech = speech.replaceAll(",","");
        speech = speech.replace("?","");
        speech = speech.replaceAll("\'","");
        
        //key=String型,value=Integer型のMap型配列を定義。
        Map<String, Integer> words = new HashMap<>();

        //数値順にソートするための一時的なArrayListを用意。
        ArrayList<Integer> list = new ArrayList<>();

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for(String s : speech.split(" ")){
            words.put(s,0);
        }
        //文字列の単語を一つ一つ確認し、indexOfの返り値が-1より大きければ（存在すれば）
        //一時保存用の変数countに現在のvalueを代入。そしてcountの値を+1し、再度Map型の配列に代入。
        for(String s : speech.split(" ")){
            if(speech.indexOf(s) > -1){
                int count = words.get(s);
                count++;
                words.put(s, count);
            }
        }
        //ArrayList<Integer> list にwordsのvalueを代入する処理
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            list.add(entry.getValue());
        }

        //List<Integer> numbers = Arrays.asList(5,4,8,3,1);の記載は
        //List<Integer> numbers = new ArrayList<>();を省略した書き方。

        //listを降順にソート。collect(Collectors.toList())にしないとエラーになった。
        List<Integer> sortedNumbers = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        // System.out.println(sortedNumbers);
        // System.out.println(words)

        // for (Map.Entry<String, Integer> entry : words.entrySet()) {
        //     System.out.println(entry.getValue());
        // }
        for(int num : sortedNumbers){
            for(Map.Entry<String,Integer> entry : words.entrySet()){
                if(entry.getValue() == num){
                    sortedMap.put(entry.getKey(),num);
                }
            }
        }
        // System.out.println(sortedMap);
        for(String q : sortedMap.keySet()){
            System.out.println(q+":"+sortedMap.get(q));
        }
    }
}
