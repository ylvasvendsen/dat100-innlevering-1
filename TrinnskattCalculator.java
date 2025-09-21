import java.util.Scanner;

public class TrinnskattCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for gross income
        System.out.println("Enter your gross income (in NOK):");
        double grossIncome = scanner.nextDouble();

        double trinnskatt = calculateTrinnskatt(grossIncome);

        // Print the result
        System.out.printf("Total Trinnskatt to pay: %.2f kr%n", trinnskatt);

        scanner.close();
    }

    public static double calculateTrinnskatt(double income) {
        double tax = 0.0;

        // Trinn 5
        if (income > 1410750) {
            tax += (income - 1410750) * 0.177;
            income = 1410750;
        }

        // Trinn 4
        if (income > 942400) {
            tax += (income - 942400) * 0.167;
            income = 942400;
        }

        // Trinn 3
        if (income > 697150) {
            tax += (income - 697150) * 0.137;
            income = 697150;
        }

        // Trinn 2
        if (income > 306050) {
            tax += (income - 306050) * 0.040;
            income = 306050;
        }

        // Trinn 1
        if (income > 217400) {
            tax += (income - 217400) * 0.017;
        }

        return tax;
    }
}