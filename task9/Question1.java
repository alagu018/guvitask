package task9;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String str = sc.nextLine();
		String rstr = "";
		char ch;
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rstr = ch + rstr;
			
		}
	
		if(str.equals(rstr)) {
			System.out.println("given word is palindrome");
	
		}else {
			System.out.println("given word is not a palindrome");
		}

	}

}
