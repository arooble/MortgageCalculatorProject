public class Tester {

    public static void main (String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(0);
        System.out.println(wage);
    }


}
