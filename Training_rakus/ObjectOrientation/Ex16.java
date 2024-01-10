package ObjectOrientation;

public class Ex16 {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4};
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
        String[] names = new String[10];
        names[0] = "檜垣拓";
        names[5] = "檜垣拓";
        for(String name : names){
            if(name == null){
                System.out.println("空");
            }else{
                System.out.println(name);
            }
        }
    }
}
