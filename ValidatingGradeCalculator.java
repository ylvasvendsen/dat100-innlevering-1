import java.util.Scanner;

public class ValidatingGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_STUDENTS = 10;
        
        System.out.println("Starting grade calculation for " + NUMBER_OF_STUDENTS + " students.");

        // Outer loop: Runs 10 times, once for each student
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            
            System.out.println("\n--- Student " + (i + 1) + " ---");
            int score;
            
            // Inner loop (Input Control): Runs until a valid score (0-100) is entered
            do {
                System.out.print("Enter score (0-100): ");
                // Check if the input is an integer before reading it
                if (scanner.hasNextInt()) {
                    score = scanner.nextInt();
                } else {
                    // Handle non-integer input to prevent an infinite loop
                    System.out.println("Error: Invalid input type. Please enter an integer score.");
                    scanner.next(); // Consume the invalid token
                    score = -1; // Set an invalid score to force loop continuation
                    continue; 
                }

                // Check the validation criteria
                if (score < 0 || score > 100) {
                    System.out.println("Error: Score is outside the valid range (0-100). Please enter the score again.");
                }

            } while (score < 0 || score > 100); // Loop condition: Keep asking while the score is invalid
            
            // --- Grade Calculation: We now have a guaranteed valid score (0-100) ---
            String grade;
            
            if (score >= 90) { 
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 50) {
                grade = "D";
            } else if (score >= 40) {
                grade = "E";
            } else { // 0 - 39
                grade = "F";
            }
            
            // Output Result
            System.out.println("Result: Grade " + grade);
        }
        
        System.out.println("\nAll " + NUMBER_OF_STUDENTS + " students processed.");
        scanner.close();
    }
}