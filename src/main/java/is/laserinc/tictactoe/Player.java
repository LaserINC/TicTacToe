package is.laserinc.tictactoe;

public class Player {
    private char player;

    public Player(char _player) {
        this.player = _player;
    }

    public char currentPlayer() {
        return this.player;
    }
    
    // Change player to other player.
    public void changeToPlayer(char changeTo) {
        if(changeTo == 'x' || changeTo == 'o') {
            this.player = changeTo;
    }
  
  }

}
