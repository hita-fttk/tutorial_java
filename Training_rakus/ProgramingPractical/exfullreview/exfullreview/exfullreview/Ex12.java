package exfullreview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex12 {
    public static void main(String[] args) {
        Map<String, Integer> winners = new HashMap<>();
        List<String> countries = Arrays.asList("ウルグアイ","イタリア","イタリア","ウルグアイ","ドイツ","ブラジル","ブラジル","イングランド","ブラジル"
        ,"ドイツ","アルゼンチン","イタリア","アルゼンチン","ドイツ","ブラジル","フランス","ブラジル","イタリア","スペイン","ドイツ");
        
        for(String s : countries){
            if(countries.indexOf(s)>-1){
                //Map型配列のwinnersのkeyの中にString型の変数sが含まれていない場合、winnersにsと初期値の0を追加
                if(!winners.containsKey(s)){
                    winners.put(s,0);
                }
            }
        }
        //ArrayList<String>の国々を一つずつ取得し、winnersのkeyと合致したらcountを＋1する。
        for(String c : countries){
            if(winners.containsKey(c)){
                int count = winners.get(c);
                count++;
                winners.put(c, count);
            }
        }
        for(String country : winners.keySet()){
            System.out.println(country+"の優勝回数は"+winners.get(country)+"回です。");
        }
    }
}
