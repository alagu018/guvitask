package Task11;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in); 
		System.out.println("Enter value for A : ");
		int a = sc.nextInt();
		System.out.println("Enter value for B : ");
		int b = sc.nextInt();
		int c;
		
		try { 
			c=a/b;  
			System.out.println("Division is : " +c); 
		}
		catch(ArithmeticException ae) 
		{
			System.out.println("!! Please enter a valid number for B !!");
			System.out.println(); 
			ae.printStackTrace(); 
			System.out.println(ae); 
		}
		

	}

}
