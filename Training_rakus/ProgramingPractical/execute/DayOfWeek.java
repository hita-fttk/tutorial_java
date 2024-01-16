/**
 * @author HigakiTaku
 */

public enum DayOfWeek {
    SUNDAY("日",1,"最初の曜日です。基本的にお休みです。"),
    MONDAY("月",2,"憂鬱な曜日であることが多いですが祝日になりうることもあります。"),
    TUESDAY("火",3,"一週間のうち一番時間を長く感じる曜日かもしれません。"),
    WEDNESDAY("水",4,"週の折り返しの曜日です。この日を乗り切ればモチベ上がります。"),
    THURSDAY("木",5,"この日が終わればほぼ消化試合になると考えられます。しかし疲労もピークに達します。"),
    FRIDAY("金",6,"この日は華のある曜日です。サラリーマンが浮かれて財布のひもが緩みがちです。"),
    SATURDAY("土",7,"この日は休日の初日です。この日は何をしても良いとされている日なので夜更かしに注意です。");
    private final String key;    
    
    private final int value;
    private final String comment;    
    
    
    private DayOfWeek(String key,int value, String comment){
        this.key = key;
        this.value = value;
        this.comment = comment;
    }
    
    public int getValue(){
        return value;
    }
    public String getKey() {
        return key;
    }
    public String getComment() {
        return comment;
    }

    public static DayOfWeek of(String key){
        for(DayOfWeek dayOfWeek : DayOfWeek.values()){
            if(dayOfWeek.key.equals(key)){
                return dayOfWeek;
            }
        }
        throw new IndexOutOfBoundsException("その文字列は曜日の中に含まれていません。");
    }
    
}
