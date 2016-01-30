interface ChessPiece{

	public int movePiece(Coordinate newLocation);
	public int capturePiece(ChessPiece enemyPiece){
		if(enemyPiece == NULL)
			return 0;
		//update view with a capture;
		
	}
	Coordinate[] getMoveSet();
	Coordinate[] getCaptureSet();
	public boolean checkCapture(Coordinate location);
	public boolean checkMove(Coordinate newLocation);

	//getters and setters
	public Side getSide();
	public void setSide(Side side);

	public Coordinate getLocation();
	public void setLocation(Coordinate location);

	public String getName();
	public void setName(String name);
}