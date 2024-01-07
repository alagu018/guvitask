package task9;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a mark");
		int mark = sc.nextInt();
		if(mark  == 100) {
			System.out.println("your grade is S");
			
		}if( mark < 100 && mark >90) {
			System.out.println("your grade is A");
		}if( mark < 90 && mark > 80) {
			System.out.println("your grade is B");
		}if( mark < 80 && mark > 70) {
			System.out.println("your grade is C");
		}if( mark < 70 && mark > 60) {
			System.out.println("your grade is D");
		}if( mark < 60 && mark > 50) {
			System.out.println("your grade is E");
			
			
		}
		if(mark < 50) {
			System.out.println("your grade is F");
		}
		

	}

}
