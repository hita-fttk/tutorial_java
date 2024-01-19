package ObjectOrientation;

public class TV {
    private boolean power = false;
    private int channel;

    TV(int channel){
        this.channel = channel;
    }

    public void powerOn(){
        this.power = true;
        System.out.println("電源ON");
    }
    
    public void powerOff(){
        this.power = false;
        System.out.println("電源OFF");
    }
    public void setChannel(int newChannel){
        if(this.power == false){
            System.out.println("電源を入れてください");
        }else{
            this.channel = newChannel;
            
        }
    }
    
    public void display(){
        if(this.power == false){
            System.out.println("電源を入れてください");
        }else{
            System.out.println("現在"+this.channel+"チャンネルを表示しています");
        }
    }
}
