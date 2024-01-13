package task10;


import java.util.Scanner;

class Account{ 
	float balance;  
	float deposit;
	float withdraw;
	
	public Account() { 
		balance = 2500.00f;
	}
	
	public Account(float a, float b) { 
		balance = 2500.00f;
		deposit = a; 
		withdraw = b;
	}
	
	public void withdraw() { 
		balance = balance - withdraw;
		System.out.println("Balance aftet withdrawal is : " +balance);
		
	}
	
	public void deposit() { 
		balance = balance + deposit;
		System.out.println("Balance after deposit : " +balance);
	}
}



public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account obj = new Account(); 
		
		System.out.println("Current balance is : " +obj.balance);
		
		System.out.println("Enter deposit : "); 
		float d = sc.nextFloat();
		
		System.out.println("Enter withdraw : ");
		float w = sc.nextFloat();
		
		Account obj1 = new Account(d,w); 
		
		
		
		obj1.deposit();
		
		
		obj1.withdraw();
		
		

	}

}