public class Main
{
    int batteryLevel;
      
    public Main()
    {
        batteryLevel = 100;
    }
      
    public void activate()
    {
        System.out.println("Activated");
            
        batteryLevel = batteryLevel - 5;
            
        System.out.println("Battery level is: " + batteryLevel + "%.");
    }
      
    public void chargeBattery(int hours)
    {
        System.out.println("Charging...");
            
        batteryLevel = batteryLevel + hours;
            
        if (batteryLevel <= 100)
        {
            batteryLevel = 100;
                  
            System.out.println("Battery level: " + batteryLevel + "%.");
        }
        else
        {
            System.out.println("Battery level: " + batteryLevel + "%.");
        }
    }
      
    public int checkBatteryLevel()
    {
        System.out.println("Battery level: " + batteryLevel + "%.");
            
        return batteryLevel;
    }
      
    public void hover(int feet)
    {
        if (feet < 2)
        {
            System.out.println("Error! Cannot hover above 2 feet.");
        }
        else
        {
            System.out.println("Hovering...");
                    
            batteryLevel = batteryLevel - 20;
                  
            System.out.println("Battery level: " + batteryLevel + "%.");
        }
    }
      
    public static void main(String[] args)
    {
        Main myDroid = new Main();
        myDroid.activate();
        myDroid.chargeBattery(5);
        myDroid.hover(15);
    }
}