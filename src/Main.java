import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("E001", "Alice", "Smith", 5000.0, "Java", 1000.0);
        Developer dev2 = new Developer("E002", "Bob", "Johnson", 4500.0, "Python", 800.0);
        Tester test1 = new Tester("E003", "Charlie", "Brown", 4000.0, true);
        Tester test2 = new Tester("E004", "Diana", "Prince", 3800.0, false);
        
        System.out.println("--- Testing equals() ---");
        Developer dev1Copy = new Developer("E001", "Alice", "Smith", 5000.0, "Java", 1000.0);
        System.out.println("dev1 equals dev2? " + dev1.equals(dev2));
        System.out.println("dev1 equals dev1Copy (same id)? " + dev1.equals(dev1Copy));
        System.out.println("------------------------\n");

        List<Employee> team = new ArrayList<>();
        team.add(dev1);
        team.add(dev2);
        team.add(test1);
        team.add(test2);

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
