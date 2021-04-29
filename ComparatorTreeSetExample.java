package collection.exmp;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTreeSetExample {
	public static void main(String[] args) {
		Employee2 e1=new Employee2("Ram","pune",101);
		Employee2 e2=new Employee2("Jayshri","Ambajogai",102);
		Employee2 e3=new Employee2("Vijayshri","sangli",103);
		Set set1=new TreeSet(new ComparatorForId());
		
		set1.add(e2);
		set1.add(e3);
		set1.add(e1);
		
		System.out.println("\n*****Sorting by Employee Id******");
		for(Object e:set1)
		{
			System.out.println(e);
		}
		
		Employee2 emp1=new Employee2("A","Abc",10);
		Employee2 emp2=new Employee2("Z","Pqr",50);
		Employee2 emp3=new Employee2("C","Xyz",40);
		Set set2=new TreeSet(new CompratorForName());
		
		set2.add(emp2);
		set2.add(emp3);
		set2.add(emp1);
		System.out.println("\n*****Sorting by Employee name******");
		
		for( Object e:set2)
		{
			System.out.println(e);
		}
		
		
		Employee2 em1=new Employee2("Sony","India",10);
		Employee2 em2=new Employee2("Tina","Dubai",50);
		Employee2 em3=new Employee2("Meena","Pak",40);
		Set set3=new TreeSet(new CompratorForAddress());
		
		set3.add(em2);
		set3.add(em3);
		set3.add(em1);
		
		System.out.println("\n*****Sorting by Employee Address******");
		
		for( Object e:set3)
		{
			System.out.println(e);
		}
		
		
	}	
}
	
	class ComparatorForId implements Comparator<Employee2>
	{
		public int compare(Employee2 o1,Employee2 o2)
		{
			Employee2 num1=(Employee2) o1;
			Employee2 num2=(Employee2) o2;
			if(o1.getEid()==o2.getEid())
				return 0;
			else if(o1.getEid() < o2.getEid())
				return -1;
			else
				return 1;
		}

	}
	
	class CompratorForName implements Comparator<Employee2>
	{
		public int compare( Employee2 o1,Employee2 o2)//compare two objects in order
		{
			
			return o1.getEname().compareTo(o2.getEname());
				
		}
		
	}	
	
	
	class CompratorForAddress implements Comparator<Employee2>
	{
		public int compare( Employee2 o1,Employee2 o2)//compare two objects in order
		{
			
			return o1.getEname().compareTo(o2.getEname());
				
		}
		
	}		
	
				
	
class Employee2
{
	String ename;
	String eaddress;
	int eid;
	public Employee2(String ename, String eaddress, int eid) {
		super();
		this.ename = ename;
		this.eaddress = eaddress;
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEaddress()
	{
		return eaddress;
	}
	public void setEaddress(String eaddress)
	{
		this.eaddress=eaddress;
	}
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	@Override
	public String toString() {
		return "Employee2 [ename=" + ename + ", eaddress=" + eaddress + ", eid=" + eid + "]";
	}
}

