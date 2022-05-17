
public class EmployeeStaticTest {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d%n", EmployeeStatic.getCount());

        EmployeeStatic e1 = new EmployeeStatic("Susan", "Baker");
        EmployeeStatic e2 = new EmployeeStatic("Bob", "Blue");

        System.out.printf("%nEmployees after Instantiation:%n");
        System.out.printf("via e1: %d%n", e1.getCount());
        System.out.printf("via e2: %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", EmployeeStatic.getCount());

        System.out.printf("%nEmployee 1: %s %s%n", e1.getFirstName(), e1.getLastName());
        System.out.printf("%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName());
    }
}
