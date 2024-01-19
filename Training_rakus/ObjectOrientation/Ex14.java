package ObjectOrientation;

public class Ex14 {
    public static void main(String[] args) {

        Ex14Triathlete triathlete = new Ex14Triathlete("自宅", "手ぶら");

        triathlete.move("サイクリングロード");
        triathlete.changeTool("自転車");
        triathlete.training();
        triathlete.move("海");
        triathlete.changeTool("シューズ");
        triathlete.training();
        triathlete.move("公園");
        triathlete.changeTool("シューズ");
        triathlete.training();
    }
}
