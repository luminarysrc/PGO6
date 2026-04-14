public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;

    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public final String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateMonthlyCost() {
        return baseSalary;
    }

    public String introduceYourself() {
        return "I am " + firstName + " " + lastName + ", an employee.";
    }

    @Override
    public String toString() {
        return "Employee{id='" + employeeId + "', name='" + firstName + " " + lastName + "', salary=" + baseSalary + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeId != null ? employeeId.equals(employee.employeeId) : employee.employeeId == null;
    }
}
