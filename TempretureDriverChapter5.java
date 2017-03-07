import java.util.Scanner;

public class TemperatureDriver
{
    // reads 2 Fahrenheit temperatures and displays
    // their Celsius and Kelvin
    public static void main(String[] args)
    {
       // local variables
       double inputTemperature = 0.0;
       Scanner userInput = new Scanner(System.in);
       Temperature temp1 = new Temperature();
       Temperature temp2;
       
       System.out.print("Enter °F to be convereted: ");
       inputTemperature = userInput.nextDouble();
       System.out.println("You entered " + inputTemperature + " °F");
       temp1.setDegreeFahrenheit(inputTemperature);
       System.out.println("The °C conversion is " + temp1.getDegreeCelsius() + " °C");
       System.out.println("and " + temp1.getDegreeKelvin() + " °K");
       
       System.out.print("Enter °F to be convereted: ");
       inputTemperature = userInput.nextDouble();
       System.out.println("You entered " + inputTemperature + " °F");
       temp2 = new Temperature(inputTemperature);
       System.out.println("The °C conversion is " + temp2.getDegreeCelsius() + " °C");
       System.out.println("and " + temp2.getDegreeKelvin() + " °K");
    }
}