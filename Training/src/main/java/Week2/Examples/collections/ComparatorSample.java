package Week2.Examples.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSample implements Comparator<Employee> {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(3, "Galiza", "Chance"));
		employees.add(new Employee(1, "Silvestre", "Jerome"));
		employees.add(new Employee(2, "Dableo", "Arnold"));
		employees.add(new Employee(4, "Dableo", "Arnold"));
		
		System.out.println("Unsorted");
		for(Employee emp:employees){  
			System.out.println(emp.getEmailAddress());
		} 
		System.out.println("================================");	
		
		Collections.sort(employees, new ComparatorSample());
		
		System.out.println("Sorted");
		for(Employee emp:employees){  
			System.out.println(emp.getEmailAddress());
		} 
		System.out.println("================================");	
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmailAddress().compareTo(emp2.getEmailAddress());
	}
}
	
class Employee {

	private int id;
    private String emailAddress;

    public Employee(int id, String lname, String fname) {
        this.emailAddress = fname + lname + id + "@magenic.com";
        this.id = id;
    }

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
