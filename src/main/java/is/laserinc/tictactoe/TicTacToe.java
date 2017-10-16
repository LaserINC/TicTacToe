package is.laserinc.tictactoe;

public class TicTacToe {
	private int board[][];

	public TicTacToe() {
		board = new int[3][3];

		board[0][0] = 1;
		board[0][1] = 1;
		board[0][2] = 1;
	}

	public boolean check_win(int player) {
		boolean win_return = false;
		for(int counter = 0; counter<3; counter++) {
			int value = player;
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
		return win_return;
	}

	public static void main(String[] args) {
    // CODE HERE
		TicTacToe t = new TicTacToe();
		System.out.println(t.check_win(1));
	}



}
