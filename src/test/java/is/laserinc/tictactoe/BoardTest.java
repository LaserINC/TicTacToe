package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void switchPlayerTest(){
      // create test for this
    }

    @Test
    public void checkWinnerRow(){
      // create test for this
    	TicTacToe t = new TicTacToe();
		t.mark(1, 0, 0);
		t.mark(1, 0, 1);
		t.mark(1, 0, 2);
		assertTrue("tictactoe should return 'true'", t.check_win(1));
    }

    @Test
    public void checkWinnerColumn(){
      // create test for this
    	TicTacToe t = new TicTacToe();
		t.mark(1, 0, 0);
		t.mark(1, 1, 0);
		t.mark(1, 2, 0);
		assertTrue("tictactoe should return 'true'", t.check_win(1));
    }

    @Test
    public void checkWinnerColumnPlayer2(){
      // create test for this
    	TicTacToe t = new TicTacToe();
		t.mark(2, 0, 0);
		t.mark(2, 1, 0);
		t.mark(2, 2, 0);
		assertTrue("tictactoe should return 'true'", t.check_win(2));
    }
    @Test
    public void checkWinnerColumnPlayer2_2(){
      // create test for this
    	TicTacToe t = new TicTacToe();
		t.mark(2, 0, 0);
		t.mark(2, 1, 0);
		t.mark(2, 2, 0);
		assertFalse("tictactoe should return 'false'", t.check_win(1));
    }

    @Test
    public void checkWinnerCross(){
      // create test for this
    	TicTacToe t = new TicTacToe();
		t.mark(1, 0, 0);
		t.mark(1, 1, 1);
		t.mark(1, 2, 2);
		assertTrue("tictactoe should return 'true'", t.check_win(1));
    }

    // ADD MANY MORE TEST HERE
}
