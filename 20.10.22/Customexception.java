//Write a program to create custom exception in java.
package Exception;
import java.util.Scanner;
class InvailAgeException extends Exception { 							//subclass of exception
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvailAgeException(String str) {
		super(str);
	}
}
public class Customexception { 									// class with logic method
public void checkAge(int age) throws InvailAgeException{
	if(age<=18||age>=25) 									// checking if the age is between 18 and 25
		throw new InvailAgeException("Invalid age for enrolling in python course");
	else if(age<=0)
		throw new InvailAgeException("Age cannot be 0 or negative");
	else
		System.out.println("Proper age for enrolling in java course");
	}
public static void main(String[] args) throws InvailAgeException {				//class with main method
	Customexception c = new Customexception(); 						//creating object of previous class
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter your age to check eligibility : ");
		int age = sc.nextInt();
		c.checkAge(age);
	}
	}
}