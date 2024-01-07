package task9;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		System.out.println("enter c");
		int c = sc.nextInt();
		int large;
		large = Math.max(Math.max(a,b),c);
		System.out.println("largest among three numbers is " +large);
		
	
	}

}
