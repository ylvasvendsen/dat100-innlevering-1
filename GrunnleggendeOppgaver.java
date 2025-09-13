public class GrunnleggendeOppgaver {

    public static void main(String[] args) {
        
        // --- Oppgave G1 ---
        System.out.println("--- Oppgave G1 ---");
        // a) Declare an integer variable n
        int n = 10; 

        // b) Loop to print numbers from 1 to 10
        System.out.println("G1 b) Looping from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // c) Modify the loop to use variable 'n'
        n = 5; // Test with a new value
        System.out.println("G1 c) Looping from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        n = -3; // Test with a negative value
        System.out.println("G1 c) What happens if n is negative (" + n + ")?");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("The loop does not run, so nothing is printed.");
        System.out.println("\n");

        // --- Oppgave G2 ---
        System.out.println("--- Oppgave G2 ---");
        System.out.println("Using a while-loop to count from 20 down to 1:");
        int count = 20;
        while (count >= 1) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println("\n");
        System.out.println("--- Oppgave G3 ---");

        // --- Oppgave G3 a) and b) (using switch) ---
        System.out.println("G3 a) and b) Using a for-loop with a switch statement:");
        for (int i = 1; i <= 20; i++) {
            switch (i) {
                case 1:
                    System.out.print("A ");
                    break;
                case 2:
                    System.out.print("B ");
                    break;
                default:
                    System.out.print("C ");
                    break;
            }
        }
        System.out.println("\n");

        // --- Oppgave G3 c) (using if-else if-else) ---
        System.out.println("G3 c) Using a for-loop with an if-else if-else statement:");
        for (int i = 1; i <= 20; i++) {
            if (i == 1) {
                System.out.print("A ");
            } else if (i == 2) {
                System.out.print("B ");
            } else {
                System.out.print("C ");
            }
        }
        System.out.println("\n");
    }
}

