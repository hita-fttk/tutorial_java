public class North56 {
    public static void main(String[] args) {
        int kuku[][] = new int[9][9];

        // 配列 kuku に値を代入する

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                kuku[i][j]=(i+1)*(j+1);
            }
        }
        for(int k=0; k<9; k++){
            for(int t=0; t<9; t++){
                System.out.print(kuku[k][t]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
