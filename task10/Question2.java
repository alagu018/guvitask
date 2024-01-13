package task10;

		import java.util.Scanner;

		public class Question2 {

			public static void main(String[] args) {
				
				Employee obj = new Employee(); 
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Emp ID : "); 
				int eid = sc.nextInt();
				
				System.out.println("Enter F Name : ");
				String fname = sc.nextLine();
				
				System.out.println("Enter L Name : ");
				String lname = sc.nextLine();
				
				System.out.println("Enter Salary : ");
				int s = sc.nextInt();
				
				System.out.println("Enter hike % :");
				int h = sc.nextInt();
				
				
				obj.getID(eid); 
				System.out.println("Emp ID : " + obj.getID(obj.EmpID));
				
				obj.getFirstName(fname); 
				obj.getLastName(lname);
				System.out.println("F Name  " + obj.getName());  
				obj.getSalary(s); 
				System.out.println("M salary  " + obj.Salary);
				System.out.println("A Salary   " + obj.getAnnualSalary());
				obj.raiseSalary(h); 
				System.out.println("Salary per month after Raise : " +obj.hike);
			}

		}

		class Employee {
			
			int EmpID;        
			String FName;
			String LName;
			String Name;
			int Salary;
			int ctc;
			int raise;
			int hike;
		
			
			public int getID(int i) { 
				EmpID = i;
				return EmpID;
			}
			
			public void getFirstName(String f) { 
				FName = f;
				
			}
			
			public void getLastName(String l) { 
				LName = l;
			}
			
			public String getName() { 
				Name = FName + LName;
				return Name;
			}
			
			public void getSalary(int s1) { 
				Salary = s1;
			}
			
			public int getAnnualSalary() { 
				ctc = Salary*12;
				return ctc;
			}
			
			public int raiseSalary(int h1) { 
				raise = (h1*Salary)/100;
				hike = raise+Salary;
				return hike;
				
			}
			
		


	}


