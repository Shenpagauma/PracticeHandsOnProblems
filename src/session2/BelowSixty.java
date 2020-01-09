package session2;

public class BelowSixty extends TaxCalculations {
    double salary, taxAmount;

    public BelowSixty(double salary) {
        super(salary);
        this.salary = salary;
    }

    @Override
    public void calculateTaxBelowFifty() {
        if (salary >= 0 && salary <= 250000) {
            System.out.println("TaxAmount " + taxAmount);
        } else if (salary >= 250001 && salary <= 500000) {
            taxAmount = ((salary - 250000) * 5 / 100);
            System.out.println("TaxAmount " + taxAmount);
        } else {
            calculateTaxAboveFifty();
        }

    }
}
