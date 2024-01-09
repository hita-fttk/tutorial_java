import java.util.Random;

public class North57 {
    public static void main(String[] args) {
        int kuku[][] = new int[9][9];
        int col;
        int row;
        Random random = new Random();
        // 配列 kuku に値を代入する

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                kuku[i][j] = (i + 1) * (j + 1);
            }
        }

        int randomNumber1 = (int) (random.nextDouble() * 10);
        if (randomNumber1 == 0) {
            randomNumber1 = 1;
        }
        row = randomNumber1;
        int randomNumber2 = (int) (random.nextDouble() * 10);
        if (randomNumber2 == 0) {
            randomNumber2 = 1;
        }
        col = randomNumber2;
        System.out.println(row);
        System.out.println(col);
        System.out.println(kuku[row-1][col-1]);
    }
}
