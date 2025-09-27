import java.util.Scanner;

public class MultiStudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_STUDENTS = 10;
        
        System.out.println("Starting grade calculation for " + NUMBER_OF_STUDENTS + " students.");

        // The for-loop runs the code block 10 times (i = 0 to 9)
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Enter score (0-100): ");
            
            // Read the score for the current student
            int score = scanner.nextInt();
            
            String grade = ""; 
            
            // --- Input Validation ---
            if (score < 0 || score > 100) {
                System.out.println("Result: Error! Invalid score (must be 0-100).");
                grade = null; 
            } 
            // --- Grade Calculation (A-F) ---
            else if (score >= 90) {
                grade = "A";
            } 
            else if (score >= 80) {
                grade = "B";
            } 
            else if (score >= 60) {
                grade = "C";
            } 
            else if (score >= 50) {
                grade = "D";
            } 
            else if (score >= 40) {
                grade = "E";
            } 
            else { // 39 - 0
                grade = "F";
            }
            
            // --- Output Result ---
            if (grade != null) {
                System.out.println("Result: Grade " + grade);
            }
        }
        
        System.out.println("\nAll " + NUMBER_OF_STUDENTS + " students processed.");
        scanner.close();
    }
}