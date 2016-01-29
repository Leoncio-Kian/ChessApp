class View{
	const int BoardLength = const int BoardWidth = 8;
	const String blank = "[        ]";			//blank never loses!
	//for now, this will be entirely console log stuff
	String ChessBoardLayout[][];
	View(Board board){
		ChessBoardLayout = new String[BoardLength][BoardWidth];
		resetBoardView(Board board);
	}
	//The following method will not be used unless performance becomes a problem.
	/*
	void updateBoard(ChessPiece pieceOne, ChessPiece pieceTwo, Coordinate oldLoc, Coordinate newLoc){

	}
	*/
	void printBoard(){
		for(int i = 0; i < BoardLength; i++){
			String temp;
			for(int j = 0; j < BoardWidth; j++){
				temp += ChessBoardLayout[i][j];
			}
			system.out.println(temp);
		}
	}
	void resetBoardView(Board board){
		for(int i = 0; i < BoardLength; i++){
			for(int j = 0; j < BoardWidth; j++){
				if(board.getTile(loc) == null){
					ChessBoardLayout[i][j] = blank;
				}
				else
					ChessBoardLayout[i][j] = "[ " + board.getTileName(new Coordinate(i, j)) + " ]";
			}
		}
	}
}