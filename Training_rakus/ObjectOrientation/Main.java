package ObjectOrientation;
import java.util.Scanner;

public class Main {
    static final String GO = "g";
    static final String RIGHT = "r";
    static final String LEFT = "l";
    static final String BACK = "b";
    static final String SEARCH = "s";
    static final String DIRECTION = "d";
    public static void main(String[] args) {
        

        String input = "";
        Scanner scanner = new Scanner(System.in);
        boolean isFinish = false;
        Treasure treasure = new Treasure();

        while (!isFinish) {
            System.out.println(GO+"：向いている方向に一歩進む");
            System.out.println(RIGHT+"：右を向いて一歩進む");
            System.out.println(LEFT+"：左を向いて一歩進む");
            System.out.println(BACK+"：逆を向いて一歩進む");
            System.out.println(SEARCH+"：宝の位置を探る。現在地点に宝があれば宝を手に入れる。");
            System.out.println(DIRECTION+"：向いている方角を表示する");
            System.out.println("\\nキーを入力してください。");
            input = scanner.next();

            if(input.equals("g")){
                treasure.go();
            }else if(input.equals("r")){
                treasure.goRight();
            }else if(input.equals("l")){
                treasure.goLeft();
            }else if(input.equals("b")){
                treasure.back();
            }else if(input.equals("s")){
                isFinish = treasure.search();
            }else if(input.equals("d")){
                treasure.showDirection();
            }else{
                continue;
            }
        }
    }
}
