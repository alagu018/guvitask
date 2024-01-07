package task9;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of month");
		int month = sc.nextInt();
		float rent = 2000.00f;
		System.out.println("enter the number of days");
		int days = sc.nextInt();
		double bill;
		float percentage = 0.20f;
		float high = rent*percentage;
		switch(month) {
		case 1,2,3,7,8,9,10:
			bill = days*rent;
		System.out.println("your total bill is :" +bill);
		break;
		case 4,5,6,11,12:
			bill = days*(rent+high);
		System.out.println("your total bill is :" +bill);
		break;
		
		}

	}

}
