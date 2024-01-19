package ProgramingIntroduction;
public class Training44 {
    public static void main(String[] args) {
        printNames(5,"HigakiTaku");
    }
    static void printName(String name){
        System.out.println(name);
    }
    static void printNames(int count,String name){
        for(int i=0; i<count; i++){
            printName(name);
        }
    }
}
