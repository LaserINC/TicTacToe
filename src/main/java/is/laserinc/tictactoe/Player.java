package is.laserinc.tictactoe;

public class Player {
  private char player;

  public Player(char _player) {
    this.player = _player;
	}
  public char currentPlayer() {
    return this.player;
  }
  public void changeToPlayer(char changeTo) {
    // BARA BREYTA EF PLAYER VERDUR X EDA O
    if(changeTo == 'x' || changeTo == 'o') {
      this.player = changeTo;
    }
  }
}
