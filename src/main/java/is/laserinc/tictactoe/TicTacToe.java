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
		GameBoard.FillBoard();
		GameBoard.PrintBoard();

		do {
			System.out.println("X Pick a number");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			GameBoard.mark2('x', number);

			GameBoard.PrintBoard();
			GameBoard.checkWin();
			if(GameBoard.checkWin() == 'x'){
				System.out.println("Winner is x");
				break;
			}

			if(GameBoard.canMove()) {
				System.out.println("O Pick a number");
				Scanner scanner2 = new Scanner(System.in);
				int number2 = scanner.nextInt();
				GameBoard.mark2('o', number2);

				GameBoard.PrintBoard();
				GameBoard.checkWin();
				if(GameBoard.checkWin() == 'o'){
					System.out.println("Winner is o");
					break;
				}
			}
		} while(GameBoard.canMove() && GameBoard.checkWin() != 'x' && GameBoard.checkWin() != 'o');
		if(!GameBoard.canMove()){
			System.out.println("TIE");
		}
	}



}
