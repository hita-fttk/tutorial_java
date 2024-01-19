package exception_sample;

public class ExceptionSample4 {
    public static void main(String[] args) {
        System.out.println("プログラム開始");
        try{
            method1();
        }catch(ClassNotFoundException e){
            System.out.println("例外が発生しました");
            e.getStackTrace();
        }
        System.out.println("プログラム終了");
    }
    public static void method1() throws ClassNotFoundException{
        Class.forName(("java.lang.NotExistClass"));
    }
}
