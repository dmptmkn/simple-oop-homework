import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode
public class SalesManager extends Employee {

    private double totalSales;
    private double bonus;

    public SalesManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + ((totalSales / 100) * bonus);
    }
}
