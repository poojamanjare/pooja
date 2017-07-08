package pack1;
import java.util.Scanner;

public class DaoDemo 
{
	public static void main(String a[])
	{
		Scanner in=new Scanner(System.in);
		boolean y=true; 
		EmpDao obj1=new EmpdaoImpl();
		
		do
		{
			System.out.println("Enter the choice:\n1-View\n2-Update\n3-Delete\n4-search");
			int ch=in.nextInt();
			switch(ch)
			{
				case 1:
					for (Emp emp: obj1.getAllEmp()) 
					{
						System.out.println("Employee: [id : " + emp.getId() + ", Name : " + emp.getName() + ",Salary :" + emp.getSalary()+"]");
					}
					break;
				case 2:
					System.out.println("Enter employee id to update:");
					int n=in.nextInt();
					Emp emp =obj1.getAllEmp().get(n);
					emp.setName("Priya");
					obj1.updateEmp(emp);
					System.out.println("Employee: [id : " + emp.getId() + ", Name : " + emp.getName() + ",Salary :" + emp.getSalary()+"]");		
					break;
				case 3:
					System.out.println("Enter employee id to delete:");
					int n1=in.nextInt();
					Emp emp11 =obj1.getAllEmp().get(n1);
					obj1.deleteEmp(emp11);
					System.out.println("Employee: [id : " + emp11.getId() + ", Name : " + emp11.getName() + ",Salary :" + emp11.getSalary()+"]");		
					break;
				case 4:
					System.out.println("Enter employee id to search:");
					int n2=in.nextInt();
					Emp emp12 =obj1.getAllEmp().get(n2);
					obj1.searchEmp(emp12);
					break;
				default:
					System.out.println("Please enter correct choice...!!!");
					break;
			}
			 System.out.println("Want to continue? y/n");
		     String x=in.next();
		     char ch1=x.charAt(0); 
		     if( ch1=='n')
		     {
		            y=false;
		            System.out.println("Thank You..!!!");
		     }
		}while(y!=false);
		
	}
}
