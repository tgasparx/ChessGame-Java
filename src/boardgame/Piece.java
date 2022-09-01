package boardgame;

public class Piece {
protected Position position;
private Board board;


public Piece(Board board) {
	super();
	this.board = board;
	position = null; 
}

//somente dentro do mesmo pacote e subclassses
protected Board getBoard() { 
	return board;
}


//public void setBoard(Board board) {
//	this.board = board;
//}



}
