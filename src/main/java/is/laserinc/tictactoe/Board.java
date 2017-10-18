package is.laserinc.tictactoe;

public class Board {
	private char board[][];

	public Board() {
		board = new char[3][3];
		for(int i=0; i<board.length; i++) {
        	for(int j=0; j<board[i].length; j++) {
        		board[i][j] = '-';
        	}
        	
        }

	}

	public Board(Board b) {
		board = new char[3][3];
		for(int i=0; i<b.getBoard().length; i++) {
        	for(int j=0; j<b.getBoard()[i].length; j++) {
        		this.board[i][j] = b.getBoard()[i][j];
        	}
        }
		//System.arraycopy(b, 0, this.board, b.length);
	}

	public char[][] getBoard() {
		return this.board;
	}

	public boolean mark(char player, int x, int y) {
		if(board[x][y] == '-') {
			board[x][y] = player;
			return true;
		}
		return false;
	}

	public char checkWin() {
		char return_value = 'u';
		if(checkWin('x')) {
			return_value = 'x';
		} else if(checkWin('o')) {
			return_value = 'o';
		}
		return return_value;
	}

	public boolean checkWin(char player) {
		boolean win_return = false;
		char value = player;
		for(int counter = 0; counter<3; counter++) {
			boolean win = true;
			for(int i : board[counter]) {
				if(i != value) {
					win = false;
				}
			}
			if(win) {
				win_return = true;
			}
		}
		for(int counter = 0; counter<3; counter++) {
			boolean win = true;
			for(int i = 0; i<3; i++) {
				if(board[i][counter] != value) {
					win = false;
				}
			}
			if(win) {
				win_return = true;
			}
		}
		if(board[0][0] == value && board[1][1] == value && board[2][2] == value) {
			win_return = true;
		}
		if(board[2][0] == value && board [1][1] == value && board[0][2] == value) {
			win_return = true;
		}
		return win_return;
	}

	public void PrintBoard() {
 		System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] );
 		System.out.println("---------");
 		System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] );
 		System.out.println("---------");
 		System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] );
  	}

	public static void main(String[] args) {
    // CODE HERE
		//TicTacToe t = new TicTacToe();
		//System.out.println(t.checkWin(1));
	}



}
