package exception_sample;

public class Ex17 {
    public static void main(String[] args)  {
    OperatorException op = new OperatorException();
    try {
        System.out.println(op.execute(1, '+', 1));
        System.out.println(op.execute(2, '-', 1));
        System.out.println(op.execute(8, '*', 3));
        System.out.println(op.execute(8, '÷', 3));
        System.out.println(op.execute(8, '$', 3));
    } catch (OperatorException e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
    }
}
