package task8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int fact = 1;
		int i = 1;
		while(i <= a) {
			fact = fact*i;
			i++;
		
		}
		System.out.println("factorial of the given number is :" +fact);

	}

}