import java.util.Date;
import java.text.NumberFormat;

public class Funcionario {

    Date dataHora = new Date();

    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public Funcionario() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void netSalary(double tax) {
        this.grossSalary -= tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += (grossSalary + tax) * percentage / 100;
    }

    public String toString() {

        return " " + dataHora + "\n\n Funcionário: " + name + "\n\nSalário: "
                + NumberFormat.getCurrencyInstance().format(getGrossSalary());
    }
}
