/*
package is.laserinc.tictactoe;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.*;

public class Computer {
	private char player_char;
	private boolean smart;

	public Computer(int player_num, boolean smart) {
		this.player_char = player_char;
		this.smart = smart;
	}

	public Coordinates makeMove(Board b) {
		if(smart) {
			return smartMove(b);
		}
		return randomMove(b);
	}

	public Coordinates randomMove(Board b) {
		boolean move_made = false;
		while(!move_made) {
			int move_x = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			int move_y = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			move_made = b.mark(this.player_char, move_x, move_y);
			if(move_made) {
				return new Coordinates(move_x, move_y);
			}
		}
		return null;
	}


	public Coordinates smartMove(Board b) {
		Queue<State> States = new LinkedList<State>();//new Queue<State>();
		States.add(new State(b, null));
		boolean win = false;
		boolean first = true;
		while(States.peek() != null && !win) {
			State s = States.remove();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					State new_State;
					if(first) {
						new_State = new State(new Board(s.getBoard()), new Coordinates(i, j));
					} else {
						new_State = new State(new Board(s.getBoard()), s.getCord());
					}
					boolean move_made = new_State.getBoard().mark(this.player_char, i, j);
					if(new_State.getBoard().checkWin(this.player_char)) {
						win = true;
						return new_State.getCord();
					}
					if(move_made) {
						States.add(new_State);
					}
				}
			}
			first = false;
			if(States.peek() == null) {
				win = true;
				return randomMove(b);
			}
		}
		return randomMove(b);

	}


}*/
