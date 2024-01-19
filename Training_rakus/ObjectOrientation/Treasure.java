package ObjectOrientation;

import java.lang.Math;

public class Treasure {
    static final int NORTH = 1;
    static final int EAST = 2;
    static final int SOUTH = 3;
    static final int WEST = 4;

    int score;
    int treasureX;
    int treasureY;
    int hereX = 0;
    int hereY = 0;
    int direction = 1;

    public void startGame() {
        this.treasureX = (int) (Math.random() * 10-10);
        this.treasureY = (int) (Math.random() * 10-10);
    }

    public void go() {
        if (this.direction == 1) {
            this.hereY++;
        } else if (this.direction == 2) {
            this.hereX++;
        } else if (this.direction == 3) {
            this.hereY--;
        } else if (this.direction == 4) {
            this.hereX--;
        }
        System.out.println("移動しました");
    }

    public void goRight() {
        if (this.direction == 4) {
            this.direction = 1;
        } else {
            this.direction++;
        }
        this.go();
        System.out.println("向きを変えました");
        System.out.println("移動しました");
    }

    public void back() {
        if (this.direction >= 2) {
            this.direction -= 2;
        } else {
            this.direction += 2;
        }
        this.go();
        System.out.println("向きを変えました");
        System.out.println("移動しました");
    }

    public void goLeft() {
        if (this.direction == 1) {
            this.direction = 4;
        } else {
            this.direction--;
        }
        this.go();
        System.out.println("向きを変えました");
        System.out.println("移動しました");
    }

    public void showDirection() {
        switch (this.direction) {
            case 1:
                System.out.println("北を向いている");
                break;
            case 2:
                System.out.println("東を向いている");
                break;
            case 3:
                System.out.println("南を向いている");
                break;
            case 4:
                System.out.println("西を向いている");
                break;
            default:
                break;
        }
    }

    public boolean search() {
        if (this.treasureX - this.hereX == 0 && this.treasureY - this.hereY == 0) {
            System.out.println("宝を見つけた！");
            return true;
        } else {
            if (this.treasureX - this.hereX <= -3) {
                System.out.println("もっと西にありそうだ。");
                return false;
            } else if (this.treasureX - this.hereX >= -2 && this.treasureX - this.hereX < 0) {
                System.out.println("すこし西にありそうだ。");
                return false;
            } else if (this.treasureX - this.hereX >= 3) {
                System.out.println("もっと東にありそうだ。");
                return false;
            } else if (this.treasureX - this.hereX <= 2 && this.treasureX - this.hereX > 0) {
                System.out.println("すこし東にありそうだ。");
                return false;
            }

            else if (this.treasureY - this.hereY >= 3) {
                System.out.println("もっと北にありそうだ。");
                return false;
            } else if (this.treasureY - this.hereY <= 2 && this.treasureY - this.hereY > 0) {
                System.out.println("すこし北にありそうだ。");
                return false;
            } else if (this.treasureY - this.hereY <= -3) {
                System.out.println("もっと南にありそうだ。");
                return false;
            } else if (this.treasureY - this.hereY >= -2 && this.treasureY - this.hereY < 0) {
                System.out.println("すこし南にありそうだ。");
                return false;
            }else{
                return false;
            }
        }
    }

}
