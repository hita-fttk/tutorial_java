package exfullreview;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = createNums();
        //試行回数
        int tryCount = 1;
        int bite = 0;
        int eat = 0;
        boolean isOver = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ゲーム開始!!!");
        while(isOver){
            System.out.println("---"+tryCount+"回目---");
            for(int i=1; i<=3; i++){
                System.out.print(i+"個目:");
                int selectNum = scanner.nextInt();
                // System.out.println(nums.indexOf(selectNum));
                //indexOf()の返り値で配列に該当している場合、該当している要素の添え字を戻り値として返す。
                //ここの条件分岐はEAT。
                if(nums.indexOf(selectNum) > -1){
                    eat++;
                }
                //i-1はscannerからの入力の回数目とindexOf()で返ってきた戻り値が合致していた場合、BITE
                if(nums.indexOf(selectNum) == i-1){
                    eat--;
                    bite++;
                    if(bite==3){
                        isOver = false;
                        break;
                    }
                }
            }
            System.out.println("BITE:"+bite);
            System.out.println("EAT:"+eat);
            eat = 0;
            bite = 0;
            tryCount++;
        }
        System.out.println("ゲーム終了");
    }

    public static ArrayList<Integer> createNums(){
        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        
        while(nums.size()<3){
            int rd = random.nextInt(10);
            nums.add(rd);
            if(!nums.contains(rd)){
                nums.add(rd);
            }
        }
        return nums;
    }
}
