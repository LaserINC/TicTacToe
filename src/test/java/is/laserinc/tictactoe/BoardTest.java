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
    	Board t = new Board();
		t.mark('x', 0, 0);
		t.mark('x', 0, 1);
		t.mark('x', 0, 2);
		assertTrue("board should return 'true'", t.checkWin('x'));
    }

    @Test
    public void checkWinnerColumn(){
      // create test for this
    	Board t = new Board();
		t.mark('o', 0, 0);
		t.mark('o', 1, 0);
		t.mark('o', 2, 0);
		assertTrue("board should return 'true'", t.checkWin('o'));
    }

    @Test
    public void checkWinnerColumnPlayer2(){
      // create test for this
    	Board t = new Board();
		t.mark('x', 0, 0);
		t.mark('x', 1, 0);
		t.mark('x', 2, 0);
		assertTrue("board should return 'true'", t.checkWin('x'));
    }
    @Test
    public void checkWinnerColumnPlayer2_2(){
      // create test for this
    	Board t = new Board();
		t.mark('x', 0, 0);
		t.mark('x', 1, 0);
		t.mark('x', 2, 0);
		assertFalse("board should return 'false'", t.checkWin('o'));
    }

    @Test
    public void checkWinnerCross(){
      // create test for this
    	Board t = new Board();
		t.mark('o', 0, 0);
		t.mark('o', 1, 1);
		t.mark('o', 2, 2);
		assertTrue("board should return 'true'", t.checkWin('o'));
    }

    @Test
    public void checkResetGame() { 
        Board t = new Board();
        t.ResetGame();
        assertEquals(0, t.ResetGame());
    }
    // ADD MANY MORE TEST HERE
}
