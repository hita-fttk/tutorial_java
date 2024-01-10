package ObjectOrientation;

public class Ex14Triathlete {
    String place;
    String tool;

    Ex14Triathlete(String place, String tool){
        this.place = place;
        this.tool = tool;
    }

    public void move(String place){
        if(this.place.equals(place)){
            System.out.println("既に"+place+"にいます");
        }else{
            System.out.println(this.place+"から"+place+"へ移動しました。");
            this.place = place;
        }
    }
    public void changeTool(String tool){
        if(this.tool.equals(tool)){
            System.out.println("既に"+this.tool+"を使用しています。");
        }else{
            System.out.println(this.tool+"から"+tool+"に変更しました。");
            this.tool = tool;
        }
    }
    public void training(){
        System.out.println(this.place+"で"+this.tool+"を使用します");
        if(this.place.equals("海") && this.tool.equals("水着")){
            System.out.println("泳ぎの練習をしました");
        }else if(this.place.equals("サイクリングロード") && this.tool.equals("自転車")){
            System.out.println("自転車の練習をしました");
        }else if(this.place.equals("公園") && this.tool.equals("シューズ")){
            System.out.println("走りの練習をしました");
        }else{
            System.out.println("練習できませんでした");
        }
    }
}
