package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    // TESTS FOR FUNCTION: initializeBoard() 
    // TESTS FOR FUNCTION: canMove()
    // TESTS FOR FUNCTION: mark(char player, int x) 
    
    // TESTS FOR FUNCTION: checkWin()
    @Test
    public void checkWinForX(){
        Board t = new Board();
        t.mark('x', 1);
        t.mark('x', 2);
        t.mark('x', 3); 
        assertEquals('x', t.checkWin());   
    }

    @Test
    public void checkWinForO(){
        Board t = new Board();
        t.mark('o', 1);
        t.mark('o', 4);
        t.mark('o', 7); 
        assertEquals('o', t.checkWin());   
    }

    @Test
    public void checkIfNoWinner(){
        Board t = new Board();
        t.mark('x', 1);
        t.mark('o', 4);
        t.mark('o', 7); 
        assertEquals('u', t.checkWin());   
    }


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
    public void checkWinnerColumnForO(){
    	Board t = new Board();
    	t.mark('o', 1);
    	t.mark('o', 4);
    	t.mark('o', 7);
    	assertTrue("board should return 'true'", t.checkWin('o'));
    }

    @Test
    public void checkWinnerColumnForX(){
    	Board t = new Board();
    	t.mark('x', 1);
    	t.mark('x', 4);
    	t.mark('x', 7);
    	assertTrue("board should return 'true'", t.checkWin('x'));
    }

    @Test
    public void checkWinnerColumnForO2(){
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

    @Test
    public void checkIfNoWinnerWithFullBoard(){
        Board t = new Board();
        t.mark('o', 1);
        t.mark('x', 2);
        t.mark('o', 3);
        t.mark('x', 4);
        t.mark('o', 5);
        t.mark('x', 6);
        t.mark('x', 7);
        t.mark('o', 8);
        t.mark('x', 9);
        assertFalse("board should return 'false'", t.checkWin('o'));
    }

    @Test
    public void checkIfNoWinnerWithEmptyBoard(){
        Board t = new Board();
        assertFalse("board should return 'false'", t.checkWin('x'));
    }

    // TESTS FOR FUNCTION: printBoard()

    // TESTS FOR FUNCTION: resetGame() 
    @Test
    public void checkResetGame() {
        Board t = new Board();
        t.resetGame();
        assertEquals(0, t.resetGame());
    }

}
