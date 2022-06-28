package Week2.Examples.Java8Enhancement;

import java.util.*;

public class ComparatorOldExample{

     public static void main(String []args){
         
       
       Comparator<Employee> compareLastNameThenFirstName = 
            new Comparator<Employee> () {
                
                @Override
                public int compare(Employee p1, Employee p2) {
                    int lastNameComparison = p1.getLastName().compareTo(p2.getLastName());
                    
                    return lastNameComparison == 0 ?
                        p2.getFirstName().compareTo(p2.getFirstName()) : lastNameComparison;
                        
                }
                
            };
            
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Mau", "Tuazon"));
        employees.add(new Employee("Ronyan", "Flores"));
     
        System.out.println("BEFORE SORT");
        employees.forEach(Employee -> System.out.println(Employee.getFirstName() + " " + Employee.getLastName()));
        
        Collections.sort(employees, compareLastNameThenFirstName );
        
        System.out.println("\nAFTER SORT");
        employees.forEach(Employee -> System.out.println(Employee.getFirstName() + " " + Employee.getLastName()));
     }
}

class Employee {
    
    private String firstName;
    private String lastName;
    
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
     
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
}

