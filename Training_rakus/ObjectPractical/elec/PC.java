package elec;

import java.util.Timer;
import java.util.TimerTask;

public class PC implements Electrical {
    private boolean isPower = false;

    public void power(){
        if(this.getIsPower()){
            this.isPower = false;
            System.out.println("PCの電源が切れました");
        }else{
            Timer timer = new Timer();
            System.out.println("・・・起動中・・・");
            timer.schedule(new TimerTask() {
                public void run(){
                    System.out.println("PCの電源が入りました");
                }
            }, 3000);
            this.isPower = true;
        }
    }

    public void setIsPower(){
        this.isPower = true;
    }
    public boolean getIsPower(){
        return this.isPower;
    }
}
