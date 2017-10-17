package is.laserinc.tictactoe;

public class Board {
	private int board[][];

	public Board() {
		board = new int[3][3];

	}

	public Board(Board b) {
		board = new int[3][3];
		for(int i=0; i<b.get_board().length; i++) {
        	for(int j=0; j<b.get_board()[i].length; j++) {
        		this.board[i][j] = b.get_board()[i][j];
        	}
        }
		//System.arraycopy(b, 0, this.board, b.length);
	}

	public int[][] get_board() {
		return this.board;
	}

	public boolean mark(int player, int x, int y) {
		if(board[x][y] == 0) {
			board[x][y] = player;
			return true;
		}
		return false;
	}

	public boolean check_win(int player) {
		boolean win_return = false;
		int value = player;
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

	public static void main(String[] args) {
    // CODE HERE
		//TicTacToe t = new TicTacToe();
		//System.out.println(t.check_win(1));
	}



}
