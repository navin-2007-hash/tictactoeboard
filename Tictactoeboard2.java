import java.util.Random;

public class Tictactoeboard2 {
    public static void main(String[] args) {

        Random random = new Random();

        // 0 or 1 → simulate toss
        int toss = random.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;
        char currentSymbol;

        if (toss == 0) {
            // Player 1 starts
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
            currentSymbol = player1Symbol;
        } else {
            // Player 2 starts
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
            currentSymbol = player2Symbol;
        }

        // Display results
        System.out.println("Toss Result: " + (toss == 0 ? "Player 1 starts" : "Player 2 starts"));
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer + " (" + currentSymbol + ")");
    }
}