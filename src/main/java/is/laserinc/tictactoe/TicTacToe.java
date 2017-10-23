package is.laserinc.tictactoe;
import java.util.*;

public class TicTacToe {
	private Board board;

	public TicTacToe() {
		board = new Board();

	}

	public void game() {
		int interlope = 0;
		while(board.checkWin() == 'u') {
			if(interlope == 0) {
				interlope = 1;
			} else {

				interlope = 0;
			}
		}
	}

	public static void main(String[] args) {
		TicTacToe Game = new TicTacToe();
		Board GameBoard = new Board();
		char player_x = 'x';
		char player_o = 'o';

		char player = player_x;

		GameBoard.FillBoard();
		GameBoard.PrintBoard();

		do {
			Scanner scanner = new Scanner(System.in);
			while(player == player_x)
			{
				System.out.println("X Pick a number");
				int number = scanner.nextInt();

				if(GameBoard.mark2(player, number)){
					GameBoard.PrintBoard();
					GameBoard.checkWin();
					if(GameBoard.checkWin() == player){
						System.out.println("Winner is x");
						break;
					}
					player = player_o;
				}
				else {
					System.out.println("INVALID INPUT");
				}

			}



			if(GameBoard.canMove()) {
				while(player == player_o)
				{
					System.out.println("O Pick a number");
					Scanner scanner2 = new Scanner(System.in);
					int number2 = scanner.nextInt();
					if(GameBoard.mark2(player, number2)) {
						GameBoard.PrintBoard();
						GameBoard.checkWin();
						if(GameBoard.checkWin() == player){
							System.out.println("Winner is o");
							break;
						}
						player = player_x;
					}
					else {
						System.out.println("INVALID INPUT");
					}
				}
			}
		} while(GameBoard.canMove() && GameBoard.checkWin() != 'x' && GameBoard.checkWin() != 'o');


		if(!GameBoard.canMove()){
			System.out.println("TIE");
		}
	}



}
