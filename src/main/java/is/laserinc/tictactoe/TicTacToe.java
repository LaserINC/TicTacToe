package is.laserinc.tictactoe;

public class TicTacToe {
	private Board board;

	public TicTacToe() {
		board = new Board();

	}

	public void game() {
		int interlope = 0;
		while(board.check_win() == 'u') {
			if(interlope == 0) {
				
				interlope = 1;
			} else {
				
				interlope = 0;
			}
		}
	}

	public static void main(String[] args) {
    // CODE HERE
		//TicTacToe t = new TicTacToe();
		//System.out.println(t.check_win(1));

	}



}
