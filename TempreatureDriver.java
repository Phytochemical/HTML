import java.util.Scanner;

public class TempreatureDriver
{
    // reads 2 Fahrenheit temperatures and displays
    // their Celsius and Kelvin
    public static void main(String[] args)
    {
       // local variables
       double inputTemperature = 0.0;
       Scanner userInput = new Scanner(System.in);
       Temperature temp1;
       String temperatureType = "";
       
       System.out.print("Enter C for Celsius, F for Fahrenheit, K for Kelvin: ");
       temperatureType = userInput.next();
       
       if(!temperatureType.equalsIgnoreCase("F") && !temperatureType.equalsIgnoreCase("C") && !temperatureType.equalsIgnoreCase("K"))
       {
       		System.out.println(temperatureType + " is invalid type");
       		System.exit(0);
       }
       
       System.out.print("Enter ° to be convereted: ");
       inputTemperature = userInput.nextDouble();
       temp1 = new Temperature(temperatureType, inputTemperature);
       
       if(temperatureType.equalsIgnoreCase("F"))
       {
           System.out.println("You entered " + inputTemperature + " °F");
           System.out.println("The conversion is " + temp1.getDegreeCelsius() + "°C");
           System.out.println("The conversion is " + temp1.getDegreeKelvin() + "°K");
       }
       else if(temperatureType.equalsIgnoreCase("C"))
       {
           System.out.println("You entered " + inputTemperature + " °C");
           System.out.println("The conversion is " + temp1.getDegreeFahrenheit() + "°F");
           System.out.println("The conversion is " + temp1.getDegreeKelvin() + "°K");
       }
       else if(temperatureType.equalsIgnoreCase("K"))
       {
           System.out.println("You entered " + inputTemperature + " °K");
           System.out.println("The conversion is " + temp1.getDegreeFahrenheit() + "°F");
           System.out.println("The conversion is " + temp1.getDegreeCelsius() + "°C");         
       }
      // else
       //{
           //System.out.println("The temperature type was invalid " + temperatureType + ".\n" + "Please type \"C\", \"F\", or \"K\" ");
           
       //}
    }
}