// Temperature converter

public class Temperature
{
    private double degreeFahrenheit;
    private double degreeCelsius;
    private double degreeKelvin;
    
    // constructor that sets value in degree based on type
    public Temperature(String type, double degree)
    {
        if(type.equalsIgnoreCase("C") )
        {
            setDegreeCelsius(degree);
        }
        else if(type.equalsIgnoreCase("F") )
        {
            setDegreeFahrenheit(degree);
        }
        else if(type.equalsIgnoreCase("K") )
        {
            setDegreeKelvin(degree);
        }
    }

    public void setDegreeFahrenheit(double degree)
    {
        degreeFahrenheit = degree;
        degreeCelsius = (degreeFahrenheit - 32.0) * 5.0 / 9.0;
        degreeKelvin = degreeCelsius + 273.15;
    }
    
    public void setDegreeCelsius(double degree)
    {
        degreeCelsius = degree;
        degreeFahrenheit = degreeCelsius * 9.0 / 5.0 + 32.0;
        degreeKelvin = degreeCelsius + 273.15;
    }
    
    public void setDegreeKelvin(double degree)
    {
        degreeKelvin = degree;
        degreeCelsius = degreeKelvin - 273.15;
        degreeFahrenheit = (degreeKelvin - 273.15) * 9.0/ 5.0 + 32.0;
    }
    
    public double getDegreeCelsius()
    {
        return degreeCelsius;
    }
    
    public double getDegreeKelvin()
    {
        return degreeKelvin;

    }
    
    public double getDegreeFahrenheit()
    {
    	return degreeFahrenheit;
    }
}