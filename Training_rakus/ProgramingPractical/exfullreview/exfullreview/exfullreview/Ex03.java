package exfullreview;

public class Ex03 {
    public static void main(String[] args) {
        for(int t=1; t<=100; t++){
            System.out.println(fizzBuzz(t));
        }
    }
    public static String fizzBuzz(int i){
            if(i%3==0 && i%5==0){
                return "FizzBuzz";
            }else if(i%3==0){
                return "Fizz";
            }else if(i%5==0){
                return "Buzz";
            }else{
                Integer c = Integer.valueOf(i);
                String s = c.toString();
                return s;
            }
    }
}
