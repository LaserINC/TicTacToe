package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

@Test
public void switchPlayerTest(){
        // create test for this,
        TicTacToe t = new TicTacToe();
        t.ChangePlayer('X');
        assertEquals("Value should be X", 'X', t.player);
}

@Test
public void checkWinnerRow(){
        // create test for this
        TicTacToe t = new TicTacToe();
        t.mark('X', 0, 0);
        t.mark('X', 0, 1);
        t.mark('X', 0, 2);
        assertTrue("tictactoe should return 'true'", t.checkWin('X'));
}

@Test
public void checkWinnerColumn(){
        // create test for this
        TicTacToe t = new TicTacToe();
        t.mark('X', 0, 0);
        t.mark('X', 1, 0);
        t.mark('X', 2, 0);
        assertTrue("tictactoe should return 'true'", t.checkWin('X'));
}

@Test
public void checkWinnerColumnPlayer2(){
        // create test for this
        TicTacToe t = new TicTacToe();
        t.mark('O', 0, 0);
        t.mark('O', 1, 0);
        t.mark('O', 2, 0);
        assertTrue("tictactoe should return 'true'", t.checkWin('X'));
}
@Test
public void checkWinnerColumnPlayer2_2(){
        // create test for this
        TicTacToe t = new TicTacToe();
        t.mark('O', 0, 0);
        t.mark('O', 1, 0);
        t.mark('O', 2, 0);
        assertFalse("tictactoe should return 'false'", t.checkWin('O'));
}

@Test
public void checkWinnerCross(){
        // create test for this
        TicTacToe t = new TicTacToe();
        t.mark('X', 0, 0);
        t.mark('X', 1, 1);
        t.mark('X', 2, 2);
        assertTrue("tictactoe should return 'true'", t.checkWin('X'));
}

// ADD MANY MORE TEST HERE
}
