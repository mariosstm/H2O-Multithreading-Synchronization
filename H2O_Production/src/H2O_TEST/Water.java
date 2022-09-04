package H2O_TEST;


public class Water extends Thread{
    WaterFactory factory;
    
    public Water(WaterFactory factory) {
        this.factory = factory;
    }
    
    @Override
    public void run() {
        try {
            factory.makeWater();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}