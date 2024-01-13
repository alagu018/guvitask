package task10;


import java.util.Scanner;


class Circle {
	int radius;  
	double pi;
	double circum1;
	
	public Circle(int r, double p) {  
		radius = r; 
		pi = p;
	}
	
	public double circum() { 
		circum1 = pi*2*radius;
		return circum1;
		
	}
}

public class Question3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the radius of the circle : ");
		int rad = sc.nextInt();;
		
		Circle obj1 = new Circle(rad, 3.14); 
		obj1.circum(); 
		System.out.println("Circumference is :" + obj1.circum1); 
	}

}
