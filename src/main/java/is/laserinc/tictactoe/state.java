package is.laserinc.tictactoe;

public class state {
	private Board board;
	private Coordinates cord;
	public state(Board b, Coordinates c) {
		this.board = b;
		this.cord = c;
	}
	public Board get_board() {
		return this.board;
	}
	public Coordinates get_cord() {
		return this.cord;
	}
}