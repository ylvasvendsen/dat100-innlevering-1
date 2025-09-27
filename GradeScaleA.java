import java.util.Scanner;

public class GradeScaleA {

    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();
        
        String grade = ""; // Variable to store the resulting grade

        // 1. Input Validation: Check for invalid scores (negative or over 100)
        if (score < 0 || score > 100) {
            System.out.println("Error: Invalid score. The score must be between 0 and 100.");
            // Set grade to null to indicate an error state and skip the final output
            grade = null; 
        } 
        // 2. Grade Calculation: Check scores from highest (A) to lowest (F)
        else if (score >= 90) { // 100 - 90
            grade = "A";
        } 
        else if (score >= 80) { // 89 - 80
            grade = "B";
        } 
        else if (score >= 60) { // 79 - 60
            grade = "C";
        } 
        else if (score >= 50) { // 59 - 50
            grade = "D";
        } 
        else if (score >= 40) { // 49 - 40
            grade = "E";
        } 
        else { // 39 - 0
            grade = "F";
        }
        
        // 3. Output the result if a valid grade was determined
        if (grade != null) {
            System.out.println("The corresponding grade is: " + grade);
        }
        
        // Close the scanner
        scanner.close();
    }
}