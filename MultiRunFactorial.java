import java.util.Scanner;

public class MultiRunFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "";

        // Ytre løkke: Fortsetter å kjøre helt til brukeren velger å avslutte
        while (true) {
            int n;

            // Indre løkke: Inputvalidering (henter inn gyldig n >= 0)
            while (true) {
                System.out.print("\nEnter a non-negative integer (n >= 0) to calculate factorial: ");
                
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    
                    if (n >= 0) {
                        scanner.nextLine(); // Rydder linjeskift
                        break; 
                    } else {
                        System.out.println("Error: The number must be 0 or greater. Try again.");
                    }
                } else {
                    System.out.println("Error: Invalid input. Please enter an integer.");
                    scanner.next(); // Konsumerer ugyldig tegn
                }
            }
            
            // Faktoriell Beregning (som før)
            long factorial = 1; 
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            
            // Skriv ut resultat
            System.out.println(n + "! = " + factorial);

            // Spør brukeren om å fortsette
            System.out.print("\nDo you want to calculate another factorial? (Press Enter to continue, or type 'n' to stop): ");
            continueInput = scanner.nextLine().trim().toLowerCase();

            // Sjekk om programmet skal avsluttes
            if (continueInput.equals("n")) {
                break; // Avslutter den ytre while(true)-løkken
            }
        }
        
        System.out.println("\nProgram finished. Goodbye!");
        scanner.close();
    }
}