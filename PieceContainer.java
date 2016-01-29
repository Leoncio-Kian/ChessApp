class PieceContainer{
	public enum Color {
		BLACK, WHITE
	}
	private Color color;
	private Coordinate location;
	private Board board;
	private String name;

	//constructor
	PieceContainer(Color color, Coordinate location, Board board, String name){
		this.color = color;
		this.location = location;
		this.board = board;
		this.name = name;
	}

	//getters and setters
	public Color getColor(){
		return color;
	}
	public Coordinate getLocation(){
		return location;
	}
	public String getName(){
		return name;
	}

	public void setColor(Color color){
		this.color = color;
	}
	public void setLocation(Coordinate location){
		this.location = location;
	}
	public void setName(String name){
		this.name = name;
	}
}