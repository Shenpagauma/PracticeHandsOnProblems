package session2;

public abstract class TaxCalculations {
    double salary, taxAmount;

    public TaxCalculations(double salary) {
        this.salary = salary;

    }

    public void calculateTaxAboveFifty() {
        if (salary >= 500001 && salary <= 1000000) {
            taxAmount = (((salary - 500000) * 20 / 100) + (10000));
            System.out.println("TaxAmount " + taxAmount);
        } else {
            taxAmount = (((salary - 1000000) * 30 / 100) + (10000 + 100000));
            System.out.println("TaxAmount " + taxAmount);
        }

    }

    public abstract void calculateTaxBelowFifty();

}
