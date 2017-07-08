package pack1;

import java.util.List;

public interface EmpDao 
{
	public Emp getEmp(int id);
	
	public List<Emp> getAllEmp();
	
	public void searchEmp(Emp emp);
	
	public void updateEmp(Emp emp);
	
	public void deleteEmp(Emp emp);

}
