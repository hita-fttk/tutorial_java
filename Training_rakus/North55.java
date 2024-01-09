public class North55 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int count = 1;
        int[] binary = new int[16];
        while (true) {
            if(i/2 == 1){
                binary[16-count] = 0;
                count +=1;
                binary[16-count] = 1;
                count +=1;
                break;
            }else{
                binary[16-count] = i%2;
                i = i/2;
                count++;
            }
        }
        System.out.println(count);
        for(int k=0; k<16; k++){
            System.out.print(binary[k]);
        }
    }
}
