package collection.exmp;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTreeSetExample {
	public static void main(String[] args) {
		Employee e1=new Employee("Ram","pune",101);
		Employee e2=new Employee("Jayshri","Ambajogai",102);
		Employee e3=new Employee("Vijayshri","sangli",103);
		Set set=new TreeSet();
		set.add(e2);
		set.add(e3);
		set.add(e1);
		for(Object o:set)
		{
			System.out.println(o);
		}
		
	}

}
class Employee implements Comparable<Employee>
{
	String emp_name;
	String emp_address;
	int emp_id;
	
	
	public Employee(String emp_name, String emp_address, int emp_id) {
		super();
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_address() {
		return emp_address;
	}


	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_address=" + emp_address + ", emp_id=" + emp_id + "]";
	}

	/*public int compareTo(Employee e)
	{
		return
				this.getEmp_name().compareTo(e.getEmp_name());
	}*/
	/*public int compareTo(Employee e)
	{
		return 
				this.getEmp_address().compareTo(e.getEmp_address());
	}*/
	
	public int compareTo(Employee e)
	{
		if(this.getEmp_id()==e.getEmp_id())
			return 0;
		else if(this.getEmp_id()<e.getEmp_id())
			return -1;
		else
			return 1;
	}
	
	
	
}
