package ProgramingIntroduction;
public class Training46 {
    public static void main(String[] args) {
        System.out.println(add(5,3));
        System.out.println(sub(5,3));
        System.out.println(multi(5,3));
        System.out.println(div(5,3));
    }
    static int add(int num1, int num2){
        return num1+num2;
    }
    static int sub(int num1, int num2){
        return num1-num2;
    }
    static int multi(int num1, int num2){
        return num1 * num2;
    }
    static int div(int num1, int num2){
        return num1/num2;
    }
}
