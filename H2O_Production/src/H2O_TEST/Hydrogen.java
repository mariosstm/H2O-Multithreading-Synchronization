package H2O_TEST;

public class Hydrogen extends Thread{
    WaterFactory factory;
    
    public Hydrogen(WaterFactory factory) {
        this.factory = factory;
    }
    
    @Override
    public void run() {
        try {
            factory.makeHydrogen();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}
