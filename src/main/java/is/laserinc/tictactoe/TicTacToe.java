package is.laserinc.tictactoe;
import java.util.*;

public class TicTacToe {
	private Board board;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board GameBoard = new Board();
		char player_x = 'x';
		char player_o = 'o';
		Player player = new Player(player_x);

		//FILL BOARD WITH VALUES 0-8 AND THEN PRINT THE BOARD
		GameBoard.PrintBoard();

		do {

			//WHILE USER HAS NOT INSERTED A VALID NUMBER
			while(player.currentPlayer() == player_x)
			{
				System.out.println("X Pick a number");
				int number = scanner.nextInt();

				if(GameBoard.mark(player.currentPlayer(), number)){
					GameBoard.PrintBoard();
					GameBoard.checkWin();
					if(GameBoard.checkWin() == player.currentPlayer()){
						System.out.println("Winner is x");
						break;
					}
					player.changeToPlayer(player_o);
				}
				else {
					System.out.println("INVALID INPUT");
				}
			}
			//IF BOARD IS NOT FULL THEN NEXT PLAYER CAN MOVE
			if(GameBoard.canMove()) {
				while(player.currentPlayer() == player_o)
				{
					System.out.println("O Pick a number");
					Scanner scanner2 = new Scanner(System.in);
					int number2 = scanner.nextInt();
					if(GameBoard.mark(player.currentPlayer(), number2)) {
						GameBoard.PrintBoard();
						GameBoard.checkWin();
						if(GameBoard.checkWin() == player.currentPlayer()){
							System.out.println("Winner is o");
							break;
						}
						player.changeToPlayer(player_x);
					}
					else {
						System.out.println("INVALID INPUT");
					}
				}
			}
		} while(GameBoard.canMove() && GameBoard.checkWin() != player_x && GameBoard.checkWin() != player_o);

		if(!GameBoard.canMove()){
			System.out.println("TIE");
		}
	}
}
