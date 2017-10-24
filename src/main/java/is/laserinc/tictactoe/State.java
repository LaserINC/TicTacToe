package is.laserinc.tictactoe;

public class State {
	private Board board;
	private Coordinates cord;
	public State(Board b, Coordinates c) {
		this.board = b;
		this.cord = c;
	}
	public Board getBoard() {
		return this.board;
	}
	public Coordinates getCord() {
		return this.cord;
	}
}
