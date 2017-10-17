package is.laserinc.tictactoe;

public class TicTacToe {
	private Board board;

	public TicTacToe() {
		board = new Board();

	}

	public static void main(String[] args) {
    // CODE HERE
		//TicTacToe t = new TicTacToe();
		//System.out.println(t.check_win(1));

    	Computer c = new Computer(1, true);
    	Board b = new Board();
    	b.mark(2, 0, 0);
    	b.mark(2, 0, 1);
    	b.mark(2, 0, 2);
    	b.mark(2, 1, 0);
    	b.mark(2, 1, 1);
    	//b.mark(2, 1, 2);
    	b.mark(2, 2, 0);
    	b.mark(2, 2, 1);
    	b.mark(2, 2, 2);
    	Coordinates cord = c.make_move(b);
    	System.out.println(cord.get_x() + " "  +cord.get_y());
	}



}
