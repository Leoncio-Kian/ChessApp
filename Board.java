class Board{
	//first is row, followed by column

	private ChessPiece[][] chessBoard;
	private Movement movement;
	Board(){
		chessBoard = new ChessPiece[8][8];
		movement = new Movement(chessBoard);
	}
	public int init(){
		for(int i = 0; i < 8; i++){
			chessBoard[1][i] = new Pawn(Black, new Coordinate(0,i), this, false);
			chessBoard[6][i] = new Pawn(White, new Coordinate(7,i), this, false);
		}
		chessBoard[0][0] = new Rook(Black, new Coordinate(0,0), this, false);
		chessBoard[7][7] = new Rook(White, new Coordinate(7,7), this, false);
		chessBoard[0][7] = new Rook(Black, new Coordinate(0,7), this, false);
		chessBoard[7][0] = new Rook(White, new Coordinate(7,0), this, false);

		chessBoard[0][1] = new Knight(Black, new Coordinate(0,1), this, false);
		chessBoard[7][6] = new Knight(White, new Coordinate(7,6), this, false);
		chessBoard[0][6] = new Knight(Black, new Coordinate(0,6), this, false);
		chessBoard[7][1] = new Knight(White, new Coordinate(7,1), this, false);

		chessBoard[0][2] = new Bishop(Black, new Coordinate(0,2), this, false);
		chessBoard[7][5] = new Bishop(White, new Coordinate(7,5), this, false);
		chessBoard[0][5] = new Bishop(Black, new Coordinate(0,5), this, false);
		chessBoard[7][2] = new Bishop(White, new Coordinate(7,2), this, false);

		chessBoard[0][3] = new Queen(Black, new Coordinate(0,3), this, false);
		chessBoard[7][4] = new King(White, new Coordinate(7,4), this, false);
		chessBoard[0][4] = new King(Black, new Coordinate(0,4), this, false);
		chessBoard[7][3] = new Queen(White, new Coordinate(7,3), this, false);

	}
	public int movePiece(Coordinate currentLoc, Coordinate newLoc){
		//this function will replace whatever is in the new location with what was in the old one.
		ChessPiece temp = getTile(currentLoc);
		setTile(temp, newLoc);
		return 0;
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