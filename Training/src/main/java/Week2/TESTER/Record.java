package Week2.TESTER;

public class Record {

    record Employee (String name, int sal){}

    public static void main(String[] args) {
        Employee employee = new Employee("Jerome", 25000);
        System.out.println(employee.name);
    }
}
