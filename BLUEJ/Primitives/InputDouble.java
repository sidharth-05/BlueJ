import java.util.Scanner;
/**
 * Write a description of class InputDouble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputDouble
{
    // instance variables - replace the example below with your own
    float input1;

    /**
     * Constructor for objects of class InputDouble
     */
    public void InputDouble()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float sampleMethod()
    {
        // put your code here
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer:");
        input1 = s.nextFloat();
        if (input1 * 10 % 2 == 0)
        {
            System.out.println("The number" + input1 + "is even");
            return input1;
        }
        else
        {
            System.out.println("The number" + input1 + "is odd. ");
            return input1;
        }
        
    }
}
