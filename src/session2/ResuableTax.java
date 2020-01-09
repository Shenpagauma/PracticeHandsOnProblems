package session2;

import java.util.Scanner;

public class ResuableTax {
    public static void main(String[] args) {
        int age;
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        age = sc.nextInt();
        System.out.println("Enter Salary");
        salary = sc.nextInt();
        if (age < 60 && age > 0) {
            BelowSixty below = new BelowSixty(salary);
            below.calculateTaxBelowFifty();
        } else if (age >= 60 && age <= 80) {
            AboveSixty above = new AboveSixty(salary);
            above.calculateTaxAboveFifty();
        } else {
            System.out.println("Age not valid");
        }

        sc.close();
    }

}
