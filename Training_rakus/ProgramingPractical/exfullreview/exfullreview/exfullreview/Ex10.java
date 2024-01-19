package exfullreview;

import java.time.LocalDate;

public class Ex10 {
    public static void main(String[] args) {
        int getYear = Integer.parseInt(args[0]);
        LocalDate localDate = LocalDate.now();
        int nowYear = localDate.getYear();
        int age = nowYear-getYear;
        if(getYear == 1868){
            System.out.println("明治元年生まれで"+age+"歳です");
        }
        else if(getYear>1868 && getYear<1912){
            System.out.println("明治"+(getYear-1868+1)+"年生まれで"+age+"歳です");
        }else if(getYear == 1912){
            System.out.println("大正元年生まれで"+age+"歳です");
        }else if(getYear>1912 && getYear<1926){
            System.out.println("大正"+(getYear-1912+1)+"年生まれで"+age+"歳です");
        }else if(getYear == 1926){
            System.out.println("昭和元年生まれで"+age+"歳です");
        }else if(getYear>1926 && getYear<1989){
            System.out.println("昭和"+(getYear-1926+1)+"年生まれで"+age+"歳です");
        }else if(getYear == 1989){
            System.out.println("平成元年生まれで"+age+"歳です");
        }else if(getYear>1989 && getYear<2019){
            System.out.println("平成"+(getYear-1989+1)+"年生まれで"+age+"歳です");
        }else if(getYear == 2019){
            System.out.println("令和元年生まれで"+age+"歳です");
        }else if(getYear>2019){
            System.out.println("令和"+(getYear-2019+1)+"年生まれで"+age+"歳です");
        }
    }
}
