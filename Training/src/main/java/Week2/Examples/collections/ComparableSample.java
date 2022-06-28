package Week2.Examples.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample {

	public static void main(String[] args) {
		
		List<EmployeeComparable> employees = new ArrayList<EmployeeComparable>();
		employees.add(new EmployeeComparable(1, "Galiza", "Chance"));
		employees.add(new EmployeeComparable(2, "Silvestre", "Jerome"));
		employees.add(new EmployeeComparable(3, "Dableo", "Arnold"));
		
		System.out.println("Unsorted");
		for(EmployeeComparable emp:employees){  
			System.out.println(emp.getLname() + ", " + emp.getFname());
		} 
		System.out.println("================================");	
		
		Collections.sort(employees);
		
		System.out.println("Sorted");
		for(EmployeeComparable emp:employees){  
			System.out.println(emp.getLname() + ", " + emp.getFname());
		} 
		System.out.println("================================");	
	}
}
	
class EmployeeComparable implements Comparable<EmployeeComparable> {

    private int id;
    private String fname;
    private String lname;

    public EmployeeComparable(int id, String lname, String fname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

	@Override
	public int compareTo(EmployeeComparable e) {
		int result = this.lname.compareTo(e.lname);
		return result == 0 ? this.fname.compareTo(e.fname) : result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}