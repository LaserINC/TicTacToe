package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    // TESTS FOR FUNCTION: initializeBoard() 
    // TESTS FOR FUNCTION: canMove()
    // TESTS FOR FUNCTION: mark(char player, int x) 
    // TESTS FOR FUNCTION: checkWin()

    // TESTS FOR FUNCTION: CheckWin(char player) 
    @Test
    public void checkWinnerRow(){
    	Board t = new Board();
    	t.mark('x', 1);
    	t.mark('x', 2);
    	t.mark('x', 3);
    	assertTrue("board should return 'true'", t.checkWin('x'));
    }

    @Test
    public void checkWinnerColumn(){
    	Board t = new Board();
    	t.mark('o', 1);
    	t.mark('o', 4);
    	t.mark('o', 7);
    	assertTrue("board should return 'true'", t.checkWin('o'));
    }

    @Test
    public void checkWinnerColumnPlayer2(){
    	Board t = new Board();
    	t.mark('x', 1);
    	t.mark('x', 4);
    	t.mark('x', 7);
    	assertTrue("board should return 'true'", t.checkWin('x'));
    }

    @Test
    public void checkWinnerColumnPlayer2_2(){
    	Board t = new Board();
    	t.mark('x', 1);
    	t.mark('x', 4);
    	t.mark('x', 7);
    	assertFalse("board should return 'false'", t.checkWin('o'));
    }

    @Test
    public void checkWinnerCross(){
    	Board t = new Board();
    	t.mark('o', 1);
    	t.mark('o', 5);
    	t.mark('o', 9);
    	assertTrue("board should return 'true'", t.checkWin('o'));
    }

    // TESTS FOR FUNCTION: printBoard()

    // TESTS FOR FUNCTION: resetGame() 
    @Test
    public void checkResetGame() {
        Board t = new Board();
        t.resetGame();
        assertEquals(0, t.resetGame());
    }

    @Test
    public void checkCanMove(){
        Board t = new Board();
        t.initializeBoard();
        assertTrue("PLayer can move",  t.canMove());
    }

    @Test
    public void checkFullBoard(){
        Board t = new Board();
        t.mark('o', 1);
        t.mark('x', 2);
        t.mark('o', 3);
        t.mark('x', 4);
        t.mark('o', 5);
        t.mark('x', 6);
        t.mark('o', 7);
        t.mark('x', 8);
        t.mark('o', 9);
        assertFalse("player can not move", t.canMove());
    }

}
