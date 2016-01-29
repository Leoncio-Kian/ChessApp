interface ChessPiece{
	public enum Color {
		BLACK, WHITE
	}

	public int movePiece(Coordinate newLocation);
	public int capturePiece(ChessPiece enemyPiece){
		if(enemyPiece == NULL)
			return 0;
		//update view with a capture;
		
	}
	void getMoveSet();
	void getCaptureSet();
	public boolean checkCapture(Coordinate location);
	public boolean checkMove(Coordinate newLocation);

	//getters and setters
	public Color getColor();
	public void setColor(Color color);

	public Coordinate getLocation();
	public void setLocation(Coordinate location);

	public String getName();
	public void setName(String name);
}