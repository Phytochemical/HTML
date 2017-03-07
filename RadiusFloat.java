import java.util.Scanner;

//calculate circumference
class Main
{
	private float radiusOne;
	
	public static void main(String[] args)
	{
		//Converts user input to float
		Scanner userInput = new Scanner(System.in);
		String radius = "";
		
		System.out.print("Enter the number for radius: ");
		radius = userInput.next();
		float radiusInput = Float.parseFloat(radius);
		
		Main calculateCircumference = new Main(radiusInput);		
	}
	
	//Constructor
	public Main(float radiusFloat)
	{
		// initializes radius
		raidusOne = radiusFloat;
	}
	
	public String toString()
	{
		return "The radius is " + radiusInput + "\n" + "The circumference is" + (2.0f * Math.PI * radiusOne);
	}
}