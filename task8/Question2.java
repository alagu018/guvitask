package task8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.println("given numeber is even");
			
		}else {
			System.out.println("given number is odd");
		}

	}

}
