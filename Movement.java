interface Movement{
	public Coordinate[] getMoveSet(ChessPiece piece);
	public Coordinate[] getCaptureSet(ChessPiece piece);
	public Boolean isValidMove(ChessPiece piece, Coordinate start, Coordinate end);
	public int movePiece(ChessPiece piece);
	public int capturePiece(ChessPiece piece, ChessPiece capturedPiece);
}