package exfullreview;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(calc(8, 3, '+'));
        System.out.println(calc(8, 3, '-'));
        System.out.println(calc(8, 3, '*'));
        System.out.println(calc(8, 3, '/'));
    }

    public static int calc(int num1, int num2, char operator){
        switch (operator) {
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            default:
                break;
        }
        throw new IndexOutOfBoundsException("+,-,*,/のどれらかの記号を入れてください");
    }
}
