package is.laserinc.tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
	// TESTS FOR FUNCTION: changeToPlayer(char changeTo)
  @Test
  public void checkChangePlayer(){
    Player player = new Player('x');
    player.changeToPlayer('o');
    assertEquals('o', player.currentPlayer());
  }

}
