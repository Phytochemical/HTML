import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        TextWriter twOne = new TextWriter();
        twOne.setTextToDisplay("bleh");
        twOne.display();
        
        TextWriter twTwo = new TextWriter("bleh 2");
        System.out.println(twTwo.getTextToDisplay());    
  }
}

class TextWriter
{
    private String textToDisplay;
    
    Scanner userInput = new Scanner(System.in);
    
    //System.out.print("Write a text:");
    //String onScreenInput = userInput.next();
    
    //System.out.println(onScreenInput);
    
    public TextWriter()
    {
        textToDisplay = "";
    }
    
    public TextWriter(String inputText)
    {
        //System.out.println("inputText " + inputText);
        //System.out.println("textToDisplay " + textToDisplay);
        textToDisplay = inputText;
    }
    
    public void setTextToDisplay(String inputText)
    {
        //textToDisplay = inputText;
        System.out.print("Write a text:");      
        String onScreenInput = userInput.next();
        inputText = onScreenInput;
        textToDisplay = inputText;
        
        //System.out.println("setTextToDisplay inputText " + inputText);
        //System.out.println("setTextToDisplay textToDisplay " + textToDisplay);      
    }
    
    public String getTextToDisplay()
    {
        //System.out.println("getTextToDisplay inputText " + textToDisplay);
        return textToDisplay;
    }
    
    public void display()
    {
        System.out.println(textToDisplay);
    }
}