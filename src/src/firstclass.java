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
	int strLength = str.length();
	char firstChar = str.charAt(0);
	char  secChar = str.charAt(strLength-1);
	System.out.println("First character: " + firstChar + "\nSecond character: " + secChar + "\nLength: " + strLength);
	System.out.print(str.substring(0,  strLength/2));
	System.out.print("\nPlease enter your desired character: ");
	String charscan = user.nextLine();
	System.out.print(str.indexOf(charscan));
	System.out.print("\nPlease choose a starting index for the substring: ");
	String startindex = user.nextLine();
	System.out.print("\nPlease choose the ending index for the substring: ");
	String stopindex = user.nextLine();
	int startindexint = Integer.parseInt(startindex);
	int stopindexint = Integer.parseInt(stopindex);
	System.out.println(str.substring(startindexint,stopindexint));
	}

}
