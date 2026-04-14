public class Tester extends Employee {
    private boolean isAutomation;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary, boolean isAutomation) {
        super(employeeId, firstName, lastName, baseSalary);
        this.isAutomation = isAutomation;
    }

    @Override
    public String introduceYourself() {
        String type = isAutomation ? "Automation Tester" : "Manual Tester";
        return "I am " + super.getFirstName() + " " + super.getLastName() + ", a " + type + ".";
    }9
    
    public void writeTests() {
        System.out.println("Writing tests...");
    }
}
