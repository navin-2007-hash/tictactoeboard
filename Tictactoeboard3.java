import java.util.Scanner;

public class Tictactoeboard3 {

    // Method to get slot from user
    public static int getSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int chosenSlot = getSlot(); // method call

        System.out.println("You selected slot: " + chosenSlot);
    }
}