package is.laserinc.tictactoe;

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.*;

public class Computer {
	private int player_num;
	private boolean smart;

	public Computer(int player_num, boolean smart) {
		this.player_num = player_num;
		this.smart = smart;
	}

	public Coordinates make_move(Board b) {
		if(smart) {
			return smart_move(b);
		}
		return random_move(b);
	}

	public Coordinates random_move(Board b) {
		boolean move_made = false;
		while(!move_made) {
			int move_x = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			int move_y = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			move_made = b.mark(this.player_num, move_x, move_y);
			if(move_made) {
				return new Coordinates(move_x, move_y);
			}
		}
		return null;
	}


	public Coordinates smart_move(Board b) {
		Queue<state> states = new LinkedList<state>();//new Queue<state>();
		states.add(new state(b, null));
		boolean win = false;
		boolean first = true;
		while(states.peek() != null && !win) {
			state s = states.remove();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					state new_state;
					if(first) {
						new_state = new state(new Board(s.get_board()), new Coordinates(i, j));
					} else {
						new_state = new state(new Board(s.get_board()), s.get_cord());
					}
					boolean move_made = new_state.get_board().mark(this.player_num, i, j);
					if(new_state.get_board().check_win(this.player_num)) {
						win = true;
						return new_state.get_cord();
					}
					if(move_made) {
						states.add(new_state);
					}
				}
			}
			first = false;
			if(states.peek() == null) {
				win = true;
				return random_move(b);
			}
		}
		return random_move(b);

	}


}