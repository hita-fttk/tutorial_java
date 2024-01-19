package exception_sample;

public class Ex16 {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        System.out.println(calc.execute(1, '+', 1));
        System.out.println(calc.execute(2, '-', 1));
        System.out.println(calc.execute(8, '$', 3));
    }
}
