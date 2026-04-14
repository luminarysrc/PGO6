import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Testing equals() ---");
        System.out.println("------------------------\n");

        List<Employee> team = new ArrayList<>();

        double totalCost = 0;

        System.out.println("--- Team Report ---");
        for (Employee emp : team) {
            System.out.println(emp.introduceYourself());
            System.out.println("Monthly Cost: $" + emp.calculateMonthlyCost());
            
            if (emp instanceof Developer) {
                Developer d = (Developer) emp;
                d.code();
            } else if (emp instanceof Tester) {
                Tester t = (Tester) emp;
                t.writeTests();
            }
            
            totalCost += emp.calculateMonthlyCost();
            System.out.println(emp.toString());
            System.out.println("-------------------");
        }
        System.out.println("\nTotal Team Monthly Cost: $" + totalCost);
    }
}
