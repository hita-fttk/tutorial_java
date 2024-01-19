package ProgramingIntroduction;
public class Training47 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(average(79, 80, 100));
    }
    static double average(int num1,int num2, int num3){
        return ((double)(num1+num2+num3)/3);
    }
}
