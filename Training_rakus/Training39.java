public class Training39 {
    public static void main(String[] args) {
        int zero = 0;
        int one = 1;
        int total = 0;
        while(true){
            total = zero + one;
            zero = one;
            one = total;
            if(total>1000){
                total = zero;
                break;
            }
            
        }
        System.out.println(total);
    }
}
