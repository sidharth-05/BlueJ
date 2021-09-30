import java.util.*;
/**
 * Write a description of class Lists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lists
{
    // instance variables - replace the example below with your own
    List<Integer> list = new ArrayList<Integer>();
    int input;
    int input1;

    /**
     * Constructor for objects of class Lists
     */
    public void additem()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        input = s.nextInt();
        list.add(input);
        System.out.println("ArrayList : " + list);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void subtractitem()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Which item do you want to remove (index): ");
        input1 = s.nextInt();
        input1 = input1;
        list.remove(input1);
        System.out.println("ArrayList : " + list);
    }
}
