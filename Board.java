class Board{
	//first is row, followed by column

	private ChessPiece[][] chessBoard;
	Board(){
		chessBoard = new ChessPiece[8][8];
	}
	public int init(){
		for(int i = 0; i < 8; i++){
			chessBoard[1][i] = new Pawn(BLACK, new Coordinate(0,i), this, false);
			chessBoard[6][i] = new Pawn(WHITE, new Coordinate(7,i), this, false);
		}
		chessBoard[0][0] = new Rook(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][7] = new Rook(WHITE, new Coordinate(7,i), this, false);
		chessBoard[0][7] = new Rook(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][0] = new Rook(WHITE, new Coordinate(7,i), this, false);

		chessBoard[0][1] = new Knight(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][6] = new Knight(WHITE, new Coordinate(7,i), this, false);
		chessBoard[0][6] = new Knight(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][1] = new Knight(WHITE, new Coordinate(7,i), this, false);

		chessBoard[0][2] = new Bishop(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][5] = new Bishop(WHITE, new Coordinate(7,i), this, false);
		chessBoard[0][5] = new Bishop(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][2] = new Bishop(WHITE, new Coordinate(7,i), this, false);

		chessBoard[0][3] = new Queen(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][4] = new King(WHITE, new Coordinate(7,i), this, false);
		chessBoard[0][4] = new King(BLACK, new Coordinate(0,i), this, false);
		chessBoard[7][3] = new Knight(WHITE, new Coordinate(7,i), this, false);

	}
	public public movePiece(Coordinate currentLoc, Coordinate newLoc){
		//this function will replace whatever is in the new location with what was in the old one.
		ChessPiece temp = getTile(currentLoc);
		setTile(temp, newLoc);
	}

	public void setTile(ChessPiece piece, Coordinate newLoc){
		chessBoard[newLoc.getX()][newLoc.getY()] = piece;
	}
	public ChessPiece getTile (Coordinate loc){
		return chessBoard[loc.getX()][loc.getY()];
	}
	public String getTileName( Coordinate loc){
		if(getTile(loc) == null)
			return null;
		else
			return getTile(loc).getName();
	}

}