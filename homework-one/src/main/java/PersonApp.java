import java.util.Arrays;

public class PersonApp {

    public static void printEmployeeInfo(Employee[] employees) {
        if (employees == null) throw new IllegalArgumentException();
        Arrays.stream(employees).forEach(System.out::println);
    }

    public static double getTotalSalary(Employee[] employees) {
        if (employees == null) throw new IllegalArgumentException();
        return Arrays.stream(employees)
                .mapToDouble(Employee::calculateSalary)
                .sum();
    }

    public static double getTotalSales(Employee[] employees) {
        if (employees == null) throw new IllegalArgumentException();
        return Arrays.stream(employees)
                .filter(employee -> employee instanceof SalesManager)
                .map(employee -> (SalesManager) employee)
                .mapToDouble(SalesManager::getTotalSales)
                .sum();
    }

    public static boolean findEmployee(Employee[] employees, Employee employee) {
        return Arrays.stream(employees)
                .anyMatch(e -> e.equals(employee));
    }
}
