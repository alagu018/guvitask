package task8;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for a");
		int a = sc.nextInt();
		System.out.println("enter value for b");
		int b = sc.nextInt();
		int temp;
		System.out.println("before swapping");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		

	}

}
