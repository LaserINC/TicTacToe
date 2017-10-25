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
    public void checkInitializeBoard(){
      Board board = new Board();
      board.initializeBoard();
      char board2[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
      assertArrayEquals(board.getBoard(), board2);
    }

    @Test
    public void checkPrintBoard(){
      Board board = new Board();
      board.mark('x', 5);
      assertEquals('x', board.getBoardPrintBoard('5', 'x'));
    }

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

}
