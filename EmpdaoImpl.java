package pack1;
import java.util.*;
import java.util.Scanner;
public class EmpdaoImpl implements EmpDao 
{
	List<Emp> emps;
	
	public EmpdaoImpl()
	{
		emps = new ArrayList<Emp>();
		Emp emp1=new Emp(0, "Amit", 10000);
		Emp emp2=new Emp(1, "Neha", 20000);
		Emp emp3=new Emp(2, "Raj", 30000);
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
	}
	
	@Override 
	   public void deleteEmp(Emp emp) 
	   {
	      emps.remove(emp.getId());
	      System.out.println("Employee: id " + emp.getId() + ", deleted from database");
	   }
	
	@Override
	public List<Emp> getAllEmp()
	{
		return emps;
	}
	@Override
	public Emp getEmp(int id)
	{
		return emps.get(id);
	}
	
	@Override
	public void updateEmp(Emp emp)
	{
		emps.get(emp.getId()).setName(emp.getName());
		System.out.println("Employee: id " + emp.getId() + ", updated in the database");
	}

	@Override
	public void searchEmp(Emp emp) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter employee id to search : ");
		int id1 = in.nextInt();
		
			System.out.println("The details of the employee with id " +id1 +" is: ");
				System.out.println("Employee: [id : " + emp.getId() + ", Name : " + emp.getName() + ",Salary :" + emp.getSalary()+"]");		
				//System.out.print(es.id +" " +es.name+" " +es.desig);
			//	flag = true;
				//break;
			//}
		// TODO Auto-generated method stub
		}
		
	}
	


