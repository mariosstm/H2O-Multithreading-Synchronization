
package H2O_TEST;
public class WaterFactory {
    public static final int WAIT_TIME = 100;
    private int oxygen;
    private int hydrogen;
    private int water;
    
    
    public WaterFactory() {
        this.oxygen = 0;
        this.water = 0;
        this.hydrogen = 0;
    }
    
    public synchronized void makeOxygen() throws InterruptedException {
        while(true) {
            System.out.println("In thread Oxygen");
            while(oxygen == 1) wait();
            oxygen++;
            
            Thread.sleep(WAIT_TIME);
            notifyAll();
        }
    }
    
    public synchronized void makeHydrogen() throws InterruptedException {
        while(true) {
            System.out.println("In thread Hydrogen");
            while(hydrogen == 2) wait();
            hydrogen++;
            
            
            Thread.sleep(WAIT_TIME);
            notifyAll();
        }
    }
    
    public synchronized void makeWater() throws InterruptedException{
        while(true) {
            System.out.println("In thread 3");
            while(hydrogen!= 2 ) wait();
            while(oxygen!=1) wait();
            water++;
            System.out.println("Water Created");
            hydrogen -=2;
            oxygen -=1;
            
            
            if(water == 100) System.exit(0);
            Thread.sleep(WAIT_TIME);
            notifyAll();
        }
    }
    
}