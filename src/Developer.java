public class Developer extends Employee {
    private String programmingLanguage;
    private double bonus;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary, String programmingLanguage, double bonus) {
        super(employeeId, firstName, lastName, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.bonus = bonus;
    }

    @Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost() + bonus;
    }

    @Override
    public String introduceYourself() {
        return "I am " + super.getFirstName() + " " + super.getLastName() + ", a Developer writing in " + programmingLanguage + ".";
    }
    
    public void code() {
        System.out.println("Writing " + programmingLanguage + " code...");
    }
}
