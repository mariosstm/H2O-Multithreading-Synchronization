package H2O_TEST;

public class Oxygen extends Thread{
    WaterFactory factory;
    
    public Oxygen(WaterFactory factory) {
        this.factory = factory;
    }
    
    @Override
    public void run() {
        try {
            factory.makeOxygen();
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }

}