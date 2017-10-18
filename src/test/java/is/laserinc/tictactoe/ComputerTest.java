package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void make_random_move_range(){
    	Computer c = new Computer(1, false);
    	Board b = new Board();
    	Coordinates cord = c.makeMove(b);
    	assertTrue("Cordinates within range", (cord.get_x() < 3 && cord.get_x() >= 0) && (cord.get_y() < 3 && cord.get_y() >= 0));
    }

	@Test
    public void make_random_move_correct(){
    	Computer c = new Computer(1, false);
    	Board b = new Board();
    	b.mark('o', 0, 0);
    	b.mark('o', 0, 1);
    	b.mark('o', 0, 2);
    	b.mark('o', 1, 0);
    	b.mark('o', 1, 1);
    	b.mark('o', 1, 2);
    	b.mark('o', 2, 0);
    	b.mark('o', 2, 1);
    	Coordinates cord = c.makeMove(b);
    	assertTrue("Cordinates within range", (cord.get_x() == 2 && cord.get_y() == 2));
    }

    @Test
    public void make_random_move_correct_2(){
        Computer c = new Computer(1, false);
        Board b = new Board();
        b.mark('o', 0, 0);
        b.mark('o', 0, 1);
        b.mark('o', 0, 2);
        b.mark('o', 1, 1);
        b.mark('o', 1, 2);
        b.mark('o', 2, 0);
        b.mark('o', 2, 1);
        b.mark('o', 2, 2);
        Coordinates cord = c.makeMove(b);
        assertTrue("Cordinates within range", (cord.get_x() == 1 && cord.get_y() == 0));
    }

    @Test
    public void make_smart_move_correct(){
        Computer c = new Computer(1, true);
        Board b = new Board();
        b.mark('o', 0, 0);
        b.mark('o', 0, 1);
        b.mark('o', 0, 2);
        b.mark('o', 1, 0);
        b.mark('o', 1, 1);
        b.mark('o', 1, 2);
        b.mark('o', 2, 0);
        b.mark('o', 2, 1);
        Coordinates cord = c.makeMove(b);
        assertTrue("Cordinates within range", (cord.get_x() == 2 && cord.get_y() == 2));
    }

    @Test
    public void make_smart_move_correct_2(){
        Computer c = new Computer(1, true);
        Board b = new Board();
        b.mark('o', 0, 0);
        b.mark('o', 0, 1);
        //b.mark('o', 0, 2);
        b.mark('o', 1, 0);
        b.mark('o', 1, 1);
        b.mark('o', 1, 2);
        b.mark('o', 2, 0);
        b.mark('o', 2, 1);
        b.mark('o', 2, 2);
        Coordinates cord = c.makeMove(b);
        assertTrue("Cordinates within range", (cord.get_x() == 0 && cord.get_y() == 2));
    }
}