package BoardPackage;

/**
 * Created by leonc on 2/10/2016.
 */
public class GameBoardState {
    private GameBoard board;
    private int inCheck;
    public GameBoardState(){
        board = new GameBoard();
        inCheck = 0;
        board.init();
    }
    public int getInCheck(){
        return inCheck;
    }
    public void setInCheck(int check){
        this.inCheck = check;
    }



}
