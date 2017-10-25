package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    // TESTS FOR FUNCTION: initializeBoard()
    @Test
    public void checkInitializeBoard(){
      Board board = new Board();
      board.initializeBoard();
      char board2[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
      assertArrayEquals(board.getBoard(), board2);
    }

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
    	Board board = new Board();
      	board.initializeBoard();
      	board.mark('x', 1);
      	board.mark('o', 4);
      	board.mark('x', 7);
      	char board2[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
      	board.resetGame();
      	assertArrayEquals(board.getBoard(), board2);
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
