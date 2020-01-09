package session2;

import java.util.Scanner;

public class TaxCalculation {

    public static void main(String[] args) {

        double taxAmount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary");
        int salary = input.nextInt();
        if (salary >= 0 && salary <= 250000) {
            System.out.printf("TaxAmount %.2f" + taxAmount);
        } else if (salary >= 250001 && salary <= 500000) {
            taxAmount = ((salary - 250000) * 5 / 100);
            System.out.printf("TaxAmount %.2f" + taxAmount);
        } else if (salary >= 500001 && salary <= 1000000) {
            taxAmount = (((salary - 500000) * 20 / 100) + (12500));
            System.out.printf("TaxAmount %.2f" + taxAmount);
        } else {
            taxAmount = (((salary - 1000000) * 30 / 100) + (12500 + 100000));
            System.out.printf("TaxAmount %.2f" + taxAmount);
        }
        input.close();

    }

}
