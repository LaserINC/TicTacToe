package is.laserinc.tictactoe;

public class Board {
	private char board[][];
	private int boardSize = 3;

	// Initialize new board of size 3x3.
	public Board() {
		board = new char[3][3];
		initializeBoard();
	}

	private void initializeBoard() {
		int counter = 1;
		for(int i = 0; i < boardSize; i++) {
			for(int j = 0; j < boardSize; j++) {
				char number = Integer.toString(counter).charAt(0);
				board[i][j] = number;
				counter++;
			}
		}
	}

	// Check if board is full or not.
	public boolean canMove() {
		for (int i = 0; i < boardSize; i++) {
	    	for (int j = 0; j < boardSize; j++) {
	        	if (board[i][j] != 'x' && board[i][j] != 'o') {
	            	return true;
	            }
	        }
	    }
	    return false;
	}

	// Mark place in board, choosen by player. Returns true
	// if marking succedes, else false if the 
	// place has already been marked.
	public boolean mark(char player, int x) {
		int counter = 1;
		if(x >= 0 || x <= boardSize) {
			for(int i = 0; i < boardSize; i++) {
				for(int j = 0; j < boardSize; j++) {
					// If place in board is found, it is marked by the player
					// making the move.
					if(counter == x){
						if(board[i][j] != 'x' && board[i][j] != 'o') {
							board[i][j] = player;
							return true;
						}
						else {
							System.out.println("Number has already been used");
							return false;
						}
					}
					counter++;
				}
			}
		}
		return false;
	}

	// Check if either player has won.
	// Return player('x' or 'u') who won, else return 'u' if no one won.
	public char checkWin() {
		char returnValue = 'u';
		
		if(checkWin('x')) {
			returnValue = 'x';
		} else if(checkWin('o')) {
			returnValue = 'o';
		}

		return returnValue;
	}

	public boolean checkWin(char player) {
		boolean winReturn = false;
		char value = player;
		
		for(int counter = 0; counter < 3; counter++) {
			boolean win = true;
			for(int i : board[counter]) {
				if(i != value) {
					win = false;
				}
			}
			if(win) {
				winReturn = true;
			}
		}
		for(int counter = 0; counter < 3; counter++) {
			boolean win = true;
			for(int i = 0; i < 3; i++) {
				if(board[i][counter] != value) {
					win = false;
				}
			}
			if(win) {
				winReturn = true;
			}
		}

		if(board[0][0] == value && board[1][1] == value && board[2][2] == value) {
			winReturn = true;
		}

		if(board[2][0] == value && board [1][1] == value && board[0][2] == value) {
			winReturn = true;
		}

		return winReturn;
	}

	public void printBoard() {
 		System.out.println("\n" + " " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] );
 		System.out.println("-----------");
 		System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] );
 		System.out.println("-----------");
 		System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] );
  	}

	public int resetGame() {
		initializeBoard();
		return 0;
	}

}
