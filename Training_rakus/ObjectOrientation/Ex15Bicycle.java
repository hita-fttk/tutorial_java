package ObjectOrientation;

public class Ex15Bicycle {
    private String bearing;

    // Ex15Bicycle(String bearing){
    //     this.bearing = bearing;
    // }
    public void setBearing(String bearing){
        this.bearing = bearing;
    }

    public void turnLeft(){
        if(this.bearing.equals("北")){
            this.bearing = "西";
            System.out.println("左へ曲がったので"+this.bearing+"を向きました");
        }else if(this.bearing.equals("東")){
            this.bearing = "北";
            System.out.println("左へ曲がったので"+this.bearing+"を向きました");
        }else if(this.bearing.equals("南")){
            this.bearing = "東";
            System.out.println("左へ曲がったので"+this.bearing+"を向きました");
        }else{
            this.bearing = "南";
            System.out.println("左へ曲がったので"+this.bearing+"を向きました");
        }
    }
    public void turnRight(){
        if(this.bearing.equals("北")){
            this.bearing = "東";
            System.out.println("右へ曲がったので"+this.bearing+"を向きました");
        }else if(this.bearing.equals("東")){
            this.bearing = "南";
            System.out.println("右へ曲がったので"+this.bearing+"を向きました");
        }else if(this.bearing.equals("南")){
            this.bearing = "西";
            System.out.println("右へ曲がったので"+this.bearing+"を向きました");
        }else{
            this.bearing = "北";
            System.out.println("右へ曲がったので"+this.bearing+"を向きました");
        }
    }
    public void display(){
        System.out.println(this.bearing);
    }
}
