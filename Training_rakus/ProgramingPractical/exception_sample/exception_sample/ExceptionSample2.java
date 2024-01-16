package exception_sample;

public class ExceptionSample2 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("プログラム開始");
        try {
            Class.forName("java.lang.NotExistClass");
            System.out.println("例外が発生しませんでした。");
            
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println("例外が発生しました");
        }

        System.out.println("プログラム終了");
    }
}
