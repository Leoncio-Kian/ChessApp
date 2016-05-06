import BoardPackage.GameBoardState;
import PlayerPackage.Player;
import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;

/**
 * Created by leonc on 2/11/2016.
 */
public class Controller {
    private GameBoardState boardState;
    private Player playerOne;
    private Player playerTwo;

    public Controller(){

    }
    public void setBoardState(GameBoardState boardState){
        this.boardState = boardState;
    }
    private GameBoardState getBoardState(){
        return boardState;
    }
    public void setPlayerOne(Player playerOne){
        this.playerOne = playerOne;
    }
    public Player getPlayerOne(){
        return playerOne;
    }
    public void createPlayerOne(){
        playerOne = new Player();
    }
    public void setPlayerTwo(Player playerTwo){
        this.playerTwo = playerTwo;
    }
    public Player getPlayerTwo(){
        return playerTwo;
    }
    public void createPlayerTwo(){
        playerTwo = new Player();
    }
    public void makeMoveCommand(Color color, Coordinate startLoc, Coordinate endLoc){
        //this method will be void for now, not sure if ill keep it that way.
    }
}
