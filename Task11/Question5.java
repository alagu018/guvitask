package Task11;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4]; 
		System.out.println("Enter a value for A : ");
		int a = sc.nextInt();
		System.out.println("Enter a value for B : ");
		int b = sc.nextInt();
		int c =a+b; 
		String s = "hello"; 
		
		try { 
			array[6] = c;  
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println(); 
			ai.printStackTrace(); 
			System.out.println(ai); 
		}
		
		try { 
			
			System.out.println(s.charAt(7));  
		
		}
		
		catch(StringIndexOutOfBoundsException si) { 
			
			System.out.println();  
			System.out.println("!! String index is invalid !!");  
			System.out.println();  
			si.printStackTrace();  
			System.out.println(si); 
		
		}
				
	}

}
