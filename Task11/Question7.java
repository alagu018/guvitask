package Task11;
import java.util.Scanner;



class InvalidAgeException extends Exception{ 
	
	public InvalidAgeException(String str) { 
		
		super(str);
		System.out.println("Invalid Age Entered");
	}
	
}
public class Question7 {

        public static void main(String[] args) throws InvalidAgeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter age :");
		int age = sc.nextInt();
		
		if(age<18) {
			
			throw new InvalidAgeException("Invalid Age");
		}
		

	}

}
