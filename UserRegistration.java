import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void firstNameCheck(String name) { // to check if first name input matches with the provided pattern 
		String regex = "^[A-Z]{1}[a-zA-Z]{2,}$"; // 1st letter is Capital and has minimum of 3 letters
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(name);
		boolean bool = match.matches();// checks if the pattern matches with the given pattern and returns a boolean value 
		if (bool) 
			System.out.println(name + " is a valid first name");
		else
			System.out.println(name + " is not a valid first name");
	}
	public static void lastNameCheck(String name) {
		String regex = "^[A-Z]{1}[a-zA-Z]{2,}$"; // 1st letter is Capital and has minimum of 3 letters
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(name);
		boolean bool = match.matches();// checks if the pattern matches with the given pattern and returns a boolean value 
		if (bool) 
			System.out.println(name + " is a valid last name");
		else
			System.out.println(name + " is not a valid last name");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a valid first name");
		String firstName = sc.next();
		System.out.println("Enter a valid last name");
		String lastName = sc.next();
		firstNameCheck(firstName);
		lastNameCheck(lastName);
	}

}
