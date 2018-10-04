package package1;
import java.util.Scanner;

public class Phone {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your phone number (ex. 4844859997): ");
		String phoneNumber = in.nextLine();
		System.out.printf("%-20s" + "(%s)" + "%s-%s", "Phone Number:", phoneNumber.substring(0, 3), phoneNumber.substring(3, 6), phoneNumber.substring(6, 10));
		
		
	}

}
