import java.util.Scanner;

class Main
{
	private double radius;
	
	public static void main(String[] args)
	{
		//Converts user input to double
		double radiusInput;
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the number for radius: ");
		radiusInput = userInput.nextDouble();

		Main calculateCircumference = new Main(radiusInput);
		System.out.println(calculateCircumference.toString());
		
	}
	
	//Constructor
	public Main(double radiusDouble)
	{
		// initializes radius
		raidus = radiusDouble;
	}
	
	public String toString()
	{
		return "The radius is " + radius + "\n" + "The circumference is" + (2.0 * Math.PI * radius);
	}
}