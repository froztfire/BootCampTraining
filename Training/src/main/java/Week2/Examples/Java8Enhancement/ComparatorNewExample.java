package Week2.Examples.Java8Enhancement;

import java.util.*;

public class ComparatorNewExample{

     public static void main(String []args){
         
       
      Comparator<Employee> compareLastNameThenFirstName = 
          Comparator.comparing(Employee::getLastName, Comparator.nullsFirst(String::compareTo))
            .thenComparing(Employee::getFirstName, Comparator.nullsLast(String::compareTo))
            .thenComparing(Employee::getLastName, Comparator.nullsLast(String::compareTo));
            
        List<Employee> persons = new ArrayList<Employee>();
        persons.add(new Employee("Mau", "Tuazon"));
        persons.add(new Employee("Ronyan", "Flores"));
        persons.add(new Employee(null, "Tuazon"));
        persons.add(new Employee("Ronyan", null));
        persons.add(new Employee(null, null));
     
        System.out.println("BEFORE SORT");
        persons.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
       
        Collections.sort(persons, compareLastNameThenFirstName );
       
        System.out.println("\nAFTER SORT");
        persons.forEach(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
     }
}

class Person {
    
    private String firstName;
    private String lastName;
    
    public Person(String firstName, String lastName) {
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

