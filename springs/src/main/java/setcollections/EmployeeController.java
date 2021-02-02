package setcollections;



import java.util.Set;
import java.util.TreeSet;

public class EmployeeController {
	Set<Employee> emp;

	public EmployeeController(Set<Employee> emp) {
		super();
		this.emp = emp;
	}
	
	public void process(){
	for(Employee e:emp) {
		System.out.println(e.name);

		System.out.println(e.age);
		System.out.println(e.salary);
	}
	}
	
}
