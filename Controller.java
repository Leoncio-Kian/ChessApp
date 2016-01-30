public class Controller{
	Board gameBoard;
	Controller(){
		gameBoard = new Board();
	}
	void init(){
		gameBoard.init();
	}
	int runGame(Player playerOne, Player playerTwo){
		While(true){
			playerOne.play();
			
			playerTwo.play();
		}
		return 0;
	}
}