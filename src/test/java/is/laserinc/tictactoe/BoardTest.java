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
    public void checkMark1() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertTrue("should return 'true'", t.mark('x',3));
    }

    @Test
    public void checkMark2() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertTrue("should return 'true'", t.mark('x',4));
    }

    @Test
    public void checkMark3() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertFalse("should return 'false'", t.mark('x',1));
    }

    @Test
    public void checkMark4() {
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        assertFalse("should return 'false'", t.mark('x',2));
    }

    @Test
    public void checkMark5() {
        Board t = new Board();
        t.mark('o', 1);
        t.mark('o', 2);
        assertFalse("should return 'false'", t.mark('x',1));
    }

    @Test
    public void checkMark6() {
        Board t = new Board();
        t.mark('o', 1);
        t.mark('o', 2);
        assertFalse("should return 'false'", t.mark('x',2));
    }    
}
