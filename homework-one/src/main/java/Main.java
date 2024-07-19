public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Manager("Manager1", 23, false, "ABC Ltd.", "manager", 2500, 3);
        Employee employee2 = new Manager("Manager2", 24, false, "ABC Ltd.", "manager", 2500, 4);
        Employee employee3 = new Manager("Manager3", 25, false, "ABC Ltd.", "manager", 2550, 5);
        Employee employee4 = new WageEmployee("WageEmployee1", 26, true, "ABC Ltd.", "security guard", 1000, 30, 10);
        Employee employee5 = new WageEmployee("WageEmployee2", 27, true, "ABC Ltd.", "security guard", 1000, 30, 10);
        Employee employee6 = new WageEmployee("WageEmployee3", 28, true, "ABC Ltd.", "security guard", 1000, 30, 10);
        Employee employee7 = new WageEmployee("WageEmployee4", 29, true, "ABC Ltd.", "security guard", 1000, 30, 10);
        Employee employee8 = new SalesManager("SalesManager1", 30, false, "ABC Ltd.", "sales manager", 1500, 10000, 5);
        Employee employee9 = new SalesManager("SalesManager2", 31, false, "ABC Ltd.", "sales manager", 1500, 10000, 5);
        Employee employee10 = new SalesManager("SalesManager3", 32, false, "ABC Ltd.", "sales manager", 1500, 10000, 5);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};

        PersonApp.printEmployeeInfo(employees);
        System.out.println(PersonApp.getTotalSalary(employees));
        System.out.println(PersonApp.getTotalSales(employees));
        System.out.println(PersonApp.findEmployee(employees, employee1));
    }
}
