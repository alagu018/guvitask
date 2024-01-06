package task8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int count = 0;
		while(a != 0) {
			a = a/10;
			count++;
			
		}
		System.out.println("number of digits in the given number is " +count);
		

	}

}
