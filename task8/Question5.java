package task8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int count = 0;
		for(int i=1; i <= a; i++) {
			if(a % i==0) {
				count++;
				
			}
		}
		if(count > 1) {
			System.out.println("this is not a prime number");
			
		}else {
			System.out.println("this is a prime number");
			
		}
				
	}

}
