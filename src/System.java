/**
 * Created by leonc on 2/11/2016.
 */
public class System {
    private GameBoardState boardState;
    private Controller controller;

    System(){

    }
    public void initializeGame(){
        boardState = new GameBoardState();
        controller = new Controller();
    }
    public void run(){
        initializeBoard();

    }

    public void resetGame(){

    }


}
