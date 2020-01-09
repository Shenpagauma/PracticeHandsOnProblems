package session2;

public class AboveSixty extends TaxCalculations {
    double salary, taxAmount;

    public AboveSixty(double salary2) {
        super(salary2);
        this.salary = salary2;
    }

    @Override
    public void calculateTaxBelowFifty() {
        if (salary >= 0 && salary <= 300000) {
            System.out.println("TaxAmount " + taxAmount);
        } else if (salary >= 300001 && salary <= 500000) {
            taxAmount = ((salary - 300000) * 5 / 100);
            System.out.println("TaxAmount " + taxAmount);
        } else {
            calculateTaxAboveFifty();
        }
    }

}
