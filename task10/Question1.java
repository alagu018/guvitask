package task10;

import java.util.Scanner;
class person{
	String str;
	int age;
	
	public person(String s, int a) {
		str = s;
		age = a;
		
	}
	public void getter() {
		System.out.println("Name is " +str);
		System.out.println("Age is " +age);
		
	}

	
	
	
}
public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name");
		String name = sc.nextLine();
		System.out.println("enter a age");
		int age = sc.nextInt();
		person obj = new person(name, age);
		obj.getter();
		
		
	}

}
