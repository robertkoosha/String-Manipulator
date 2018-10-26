import java.util.Scanner;

/**
 * 
 * @author robertkoosha
 * 
 */
public class firstclass {
	public static void main (String[] args) 
	{
	Scanner user  = new Scanner (System.in);
	System.out.print("Welcome to the String Manipulator. Please Press enter key to continue");
	user.nextLine();
	System.out.print("\nPlease enter a string: ");
	String str = user.nextLine();
	char firstChar = str.charAt(0);
	char  secChar = str.charAt(-1);
	System.out.print( firstChar + secChar);
	}

}
