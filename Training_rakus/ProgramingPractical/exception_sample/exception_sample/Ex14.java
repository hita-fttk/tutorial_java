package exception_sample;

public class Ex14 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void method1() throws Exception{
        
        throw new Exception("クラスが見つかりません");
    }
}
