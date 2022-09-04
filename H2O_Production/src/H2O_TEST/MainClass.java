package H2O_TEST;



public class MainClass {
    
    public static void main(String[] args) {
        
        WaterFactory factory = new WaterFactory();
        Oxygen oxygen = new Oxygen(factory);
        Hydrogen hydrogen = new Hydrogen(factory);
        Water water = new Water(factory);
        
        
        oxygen.start();
        hydrogen.start();
        water.start();
        try {
            water.join();
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
    
}