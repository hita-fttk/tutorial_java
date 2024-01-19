package exception_sample;

public class Car  {
    private int speed;
    public void run(int speed) throws IllegalArgumentException{
        if(speed <0 || speed > 180){
            try {
                throw new IllegalArgumentException("スピードの出しすぎです");
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("スピードの出しすぎです");
                e.printStackTrace();
            }
        }else{
            this.speed = speed;
            System.out.println("スピードが"+this.speed+"km/hになりました");
        }
    }
}
