package edu.jsu.mcis;

public class TicTacToe {
	
	char[][] Board;
	char CurrentPlayer;
	char NextPlayer;
	char mark;
	String winner;
	boolean endGame;
	
	public void StartNewGame() {
			this.Board = new char[3][3];
			CurrentPlayer = 'x';
			NextPlayer = 'o';
			InitializeBoard();
			this.endGame = false;
	}
	
	public void InitializeBoard(){
		for (int row = 0; row < 3; row++){
			for (int col = 0; col <3; col++){
				this.Board[row][col] = '-';
			}
		}
	}
	public void MarkLocation(int row, int col, char CurrentPlayer) {
		if(this.Board[row-1][col-1]=='-'){
			this.Board[row-1][col-1]=CurrentPlayer;
			char playerPlaceholder = CurrentPlayer;
			CurrentPlayer = NextPlayer;
			NextPlayer=playerPlaceholder;
		}
		
	}
	
	public char GetMark(int row, int col) {
		char mark = this.Board[row-1][col-1];
			return mark;
	}
    
	public void getWinner() {
		
		if(this.Board[0][0] == 'x' && this.Board[0][1] == 'x' && this.Board[0][2] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
			
		}
		if(this.Board[0][0] == 'x' && this.Board[1][1] == 'x' && this.Board[2][2] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
		}
		if(this.Board[0][0] == 'x' && this.Board[1][0] == 'x' && this.Board[2][0] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
		}
		if(this.Board[0][1] == 'x' && this.Board[1][1] == 'x' && this.Board[2][1] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
		}
		if(this.Board[0][2] == 'x' && this.Board[1][2] == 'x' && this.Board[2][2] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
			
		}
		if(this.Board[1][0] == 'x' && this.Board[1][1] == 'x' && this.Board[1][2] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
		}
		if(this.Board[2][0] == 'x' && this.Board[2][1] == 'x' && this.Board[2][2] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
		}
		if(this.Board[2][0] == 'x' && this.Board[1][1] == 'x' && this.Board[0][2] == 'x'){
			
			this.winner = "x is the winner!";
			this.endGame = true;
		}
		 
		 
		 if(this.Board[0][0] == 'o' && this.Board[0][1] == 'o' && this.Board[0][2] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		if(this.Board[0][0] == 'o' && this.Board[1][1] == 'o' && this.Board[2][2] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		if(this.Board[0][0] == 'o' && this.Board[1][0] == 'o' && this.Board[2][0] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		if(this.Board[0][1] == 'o' && this.Board[1][1] == 'o' && this.Board[2][1] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		if(this.Board[0][2] == 'o' && this.Board[1][2] == 'o' && this.Board[2][2] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		if(this.Board[1][0] == 'o' && this.Board[1][1] == 'o' && this.Board[1][2] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		if(this.Board[2][0] == 'o' && this.Board[2][1] == 'o' && this.Board[2][2] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		if(this.Board[2][0] == 'o' && this.Board[1][1] == 'o' && this.Board[0][2] == 'o'){
			
			this.winner = "o is the winner!";
			this.endGame = true;
		}
		
	}

	public boolean getTie(){
		
		boolean tiedGame = true;
		int row = 0;
		int col = 0;
		while(row < 3){
			while(col < 3){
				if(this.Board[row][col] == '-'){
					tiedGame = false;
				}
				col +=1;			
			}
			row +=1;
			col = 0;
		}
		return tiedGame;
		
	}
}
