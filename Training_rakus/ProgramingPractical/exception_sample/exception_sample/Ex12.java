package exception_sample;

public class Ex12 {
    public static void main(String[] args) {
        try {
            int answer = 10/0;
            System.out.println(answer);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("0で割り切ることが出来ません");
        }
    }
}
