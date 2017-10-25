package is.laserinc.tictactoe;
import java.util.*;

public class TicTacToe {
	private Board gameBoard;
	private char playerX = 'x';
	private char playerO = 'o';

	TicTacToe() {
		// Create new initialized instance of board.
		gameBoard = new Board();
	}

	// Ask user at end of each game, if he wants to play
	// a new one.
	private void askIfNewGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("New game?[Y/N]");
		char answer = scanner.next().charAt(0);

		if(answer == 'y' || answer == 'Y') {
			gameBoard.resetGame();
			playGame();
		}
		else if(answer == 'n' || answer == 'N'){
			return;
		}
		else {
			System.out.println("Invalid input!");
			askIfNewGame();
		}
	}

	public void playGame() {
		Scanner scanner = new Scanner(System.in);
		gameBoard.printBoard();

		Player player = new Player(playerX);

		do {
			// While user has not inserted a valid input.
			while(player.currentPlayer() == playerX)
			{
				System.out.println("X Pick a number");
				int number = scanner.nextInt();

				if(gameBoard.mark(player.currentPlayer(), number)){
					gameBoard.printBoard();
					gameBoard.checkWin();
					if(gameBoard.checkWin() == player.currentPlayer()){
						System.out.println("Winner is X!");
						break;
					}
					player.changeToPlayer(playerO);
				}
				else {
					System.out.println("Invalid input! Pick another number.");
				}
			}

			// If board is not full then next player can move.
			if(gameBoard.canMove()) {
				while(player.currentPlayer() == playerO)
				{
					System.out.println("O Pick a number");
					Scanner scanner2 = new Scanner(System.in);
					int number2 = scanner.nextInt();
					if(gameBoard.mark(player.currentPlayer(), number2)) {
						gameBoard.printBoard();
						gameBoard.checkWin();
						if(gameBoard.checkWin() == player.currentPlayer()){
							System.out.println("Winner is O!");
							break;
						}
						player.changeToPlayer(playerX);
					}
					else {
						System.out.println("Invalid input! Pick another number.");
					}
				}
			}

		}while(gameBoard.canMove() && gameBoard.checkWin() != playerX && gameBoard.checkWin() != playerO);

		// If no one can make a move. All numbers have been picked
		// and the game ended in a tie.
		if(!gameBoard.canMove()){
			System.out.println("It's a tie!");
		}

		askIfNewGame();
	}

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.playGame();
	}
}
