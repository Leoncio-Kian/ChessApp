class Queen implements ChessPiece{
	private boolean moved;
	private PieceContainer thisPiece;
	Queen(Color color, Coordinate location, Board board, boolean moved){
		thisPiece = new ChessPiece(color, location, board, "Queen");
		this.moved = moved;
	}
	public int movePiece(Coordinate newLocation){
		ChessPiece piece = board.getTile(newLocation);
		if(piece == null){
			if(checkMove(newLocation)){
				setLocation(newLocation);
				return 0;
			}
			return 1; //location not a part of the valid moveset
		}
	}

	public void getMoveSet(){
		//send next space forward to view
		if(!hasMoved()){
			//send space after that to view
		}
	}
	public void getCaptureSet(){
		//send diagonals of pawn to view
	}
	public boolean checkCapture(Coordinate location){
		
	}
	public boolean checkMove(Coordinate newLocation){

	}

	//getters and setters

	public Color getColor(){
		return thisPiece.getColor();
	}
	public Coordinate getLocation(){
		return thisPiece.getLocation();
	}
	public boolean hasMoved(){
		return moved;
	}
	public String getName(){
		thisPiece.getName();
	}
	public void setColor(Color color){
		thisPiece.setColor(color);
	}
	public void setLocation(Coordinate newLocation){
		thisPiece.setLocation(newLocation);
	}
	public void setMoved(boolean moved){
		this.moved = moved;
	}
	publiv void setName(String name){
		thisPiece.setName(name);
	}
}