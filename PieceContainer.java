class PieceContainer{
	public enum Side {
		Black, White
	}
	private Side side;
	private Coordinate location;
	private Board board;
	private String name;

	//constructor
	PieceContainer(Side side, Coordinate location, Board board, String name){
		this.side = side;
		this.location = location;
		this.board = board;
		this.name = name;
	}

	//getters and setters
	public Side getSide(){
		return side;
	}
	public Coordinate getLocation(){
		return location;
	}
	public String getName(){
		return name;
	}

	public void setSide(Side side){
		this.side = side;
	}
	public void setLocation(Coordinate location){
		this.location = location;
	}
	public void setName(String name){
		this.name = name;
	}
}