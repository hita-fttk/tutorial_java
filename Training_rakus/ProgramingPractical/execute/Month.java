public enum Month {
    JANUARY(1,"1月","最初の月です","お正月"),
    FEBRUARY(2,"2月","2番目の月です","バレンタインデー"),
    MARCH(3,"3月","3番目の月です","卒業式"),
    APRIL(4,"4月","4番目の月です","入学式"),
    MAY(5,"5月","5番目の月です","ゴールデンウイーク"),
    JUNE(6,"6月","6番目の月です","梅雨入り"),
    JULY(7,"7月","7番目の月です","夏休み開始"),
    AUGUST(8,"8月","8番目の月です","お盆、夏休み"),
    SEPTEMBER(9,"9月","9番目の月です","敬老の日"),
    OCTOBER(10,"10月","10番目の月です","ハロウィン"),
    NOVEMBER(11,"11月","11番目の月です","七五三"),
    DECEMBER(12,"12月","最後の月です","クリスマス");
    
    private final int monthNumber;
    private final String japanese;
    private final String description;
    private final String event;
    //* */
    public int getMonthNumber() {
        return monthNumber;
    }

    //* */
    public String getJapanese() {
        return japanese;
    }

    //* */
    public String getDescription() {
        return description;
    }

    //* */

    public String getEvent() {
        return event;
    }

    private Month(final int monthNumber, final String japanese,final String description, final String event){
        this.monthNumber = monthNumber;
        this.japanese = japanese;
        this.description = description;
        this.event = event;
    }
    public static Month of(int monthNumber){
        for(Month month : Month.values()){
            if(month.monthNumber==monthNumber){
                return month;
            }
        }
        throw new IndexOutOfBoundsException("1~12の数字を入力してください");
    }

    



}
