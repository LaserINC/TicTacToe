package is.laserinc.tictactoe;
import java.util.*;

public class TicTacToe {

	private int board[][];
	private boolean winReturn = false;
	char player = 'X';
	int board_size = 3;

	public TicTacToe() {
		board = new int[board_size][board_size];
	}

	public void ChangePlayer(char player_type) {
		player = player_type;
	}

	public void PrintPlayer() {
		System.out.println("Player " + player + " turn: ");
	}

	public void FillBoard() {
		int counter = 0;
		for(int i = 0; i < board_size; i++) {
			for(int j = 0; j < board_size; j++) {
				board[i][j] = counter;
				counter++;
			}
		}
	}

	public void PrintBoard() {
		System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] );
		System.out.println("---------");
		System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] );
		System.out.println("---------");
		System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] );
	}

	public void mark(char _player, int x, int y) {
		board[x][y] = player;
	}

	public boolean checkWin(char _player) {
		boolean winReturn = false;
		char value = _player;

		//lARETT TOPPUR
		for(int counter = 0; counter < board_size; counter++) {
			boolean win = true;
			for(int i : board[counter]) {
				if(i != value) {
					win = false;
				}
			}
			if(win) {
				winReturn = true;
			}
		}

		//lARETT ROD
		for(int counter = 0; counter < board_size; counter++) {
			boolean win = true;
			for(int i = 0; i < board_size; i++) {
				if(board[i][counter] != value) {
					win = false;
				}
			}
			if(win) {
				winReturn = true;
			}
		}

		//LODRETT TOP TO BOTTOM
		if(board[0][0] == value && board[1][1] == value && board[2][2] == value) {
			winReturn = true;
		}
		//LODRETT BOTTOM TO TOP
		if(board[2][0] == value && board [1][1] == value && board[0][2] == value) {
			winReturn = true;
		}
		return winReturn;
	}


	public static void main(String[] args) {
    // CODE HERE
		TicTacToe Game = new TicTacToe();
		Game.FillBoard();
		Game.PrintBoard();

		//do {
			System.out.println("PLAYER X Pick a number");
			Scanner scanner = new Scanner(System.in);
			if(scanner.hasNextInt() ) {
				int number = scanner.nextInt();
				Game.PrintBoard();
			}
			scanner.close();
		//} while(!Game.checkWin(Game.player));

		//Game.ChangePlayer('X');
		//Game.PrintPlayer();
	}



}
