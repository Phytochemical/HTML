// Temperature converter

public class Temperature
{
    private double degreeFahrenheit;
    private double degreeCelsius;
    private double degreeKelvin;
    
    // default constructor
    // sets the default value of the Temperature object to 0.00
    public Temperature()
    {
        this(0.0);
    }
    // constructor that sets Fahrenheit value then calculates Celsius and Kelvin
    // using setDegreeFahrenheit() method
    public Temperature(double degrees)
    {
        setDegreeFahrenheit(degrees);
    }
    
    public void setDegreeFahrenheit(double degrees)
    {
        degreeFahrenheit = degrees;
        degreeCelsius = (degreeFahrenheit - 32.0) * 5.0 / 9.0;
        degreeKelvin = degreeCelsius + 273.15;
    }
    
    public double getDegreeCelsius()
    {
        return degreeCelsius;
    }
    
    public double getDegreeKelvin()
    {
        return degreeKelvin;

    }
}