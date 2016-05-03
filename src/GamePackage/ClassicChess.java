package GamePackage;

import UtilitiesPackage.*;
import PlayerPackage.Player;
import ChessPiecePackage.*;
/**
 * Created by leonc on 2/13/2016.
 */
public class ClassicChess implements Game{
    private Player WhitePlayer;
    private Player BlackPlayer;
    private ChessPiece gameBoard[][];
    //private GameView gameView;

    //the following are constants.
    private final int BoardLength = 8;
    private final Color White = Color.White;
    private final Color Black = Color.Black;
    private final Direction Up = Direction.UP;
    private final Direction Down = Direction.DOWN;


    public ClassicChess(){
        this.gameBoard = new Coordinate[BoardLength][BoardLength];
    }
    public void play(){

    }
    public void isGameOver(){

    }
    public void updateBoard(){

    }
    private void initializeBoard(){
        //this method assumes that the gameBoard is initialized
        assert gameBoard != null;

        for(int i = 0; i < BoardLength; i++ ){
            setChessPiece(new Pawn( White, new Coordinate(1,i), Up));
            setChessPiece(new Pawn( Black, new Coordinate(6,i), Down));
            for(int j = 2; j < 6; j++){
                removeChessPiece();
            }
        }
        setChessPiece( new Rook(White, new Coordinate(0,0)) );
        setChessPiece( new Rook(White, new Coordinate(0,7)) );
        setChessPiece( new Rook(Black, new Coordinate(7,0)) );
        setChessPiece( new Rook(Black, new Coordinate(7,7)) );

        setChessPiece( new Knight(White, new Coordinate(0,1)) );
        setChessPiece( new Knight(White, new Coordinate(0,6)) );
        setChessPiece( new Knight(Black, new Coordinate(7,1)) );
        setChessPiece( new Knight(Black, new Coordinate(7,6)) );

        setChessPiece( new Bishop(White, new Coordinate(0,2)) );
        setChessPiece( new Bishop(White, new Coordinate(0,5)) );
        setChessPiece( new Bishop(Black, new Coordinate(7,2)) );
        setChessPiece( new Bishop(Black, new Coordinate(7,5)) );

        setChessPiece( new King( White, new Coordinate(0,4)) );
        setChessPiece( new Queen(White, new Coordinate(0,3)) );
        setChessPiece( new King( Black, new Coordinate(7,4)) );
        setChessPiece( new Queen(Black, new Coordinate(7,3)) );
    }
    public boolean checkChessPiece(Coordinate loc){

        boolean check = checkValidCoordinate(loc);
        assert check;

        if(gaemBoard[loc.getRow()][loc.getColumn()] == null)
            return false;
        else
            return true;
    }
    public void removeChessPiece(Coordinate loc){

        boolean check = checkValidCoordinate(loc);
        assert check;

        gameBoard[loc.getRow()][loc.getColumn()] = null;

    }
    public boolean checkValidCoordinate(Coordinate loc){
        if(loc == null)
            return false;
        if(loc.getRow() < 0 || loc.getRow() > 7 || loc.getColumn() < 0 || loc.getColumn() > 7)
            return false;
        return true;
    }
    public int moveChessPiece(Coordinate startLoc, Coordinate endLoc){
        if(!checkValidCoordinate(startLoc) || !checkValidCoordinate(endLoc))
            return -1;
        if(!checkChessPiece(startLoc))
            return -2;

        setChessPiece(endLoc, getChessPiece(startLoc));
        removeChessPiece(startLoc);
        return 0;
    }
    public Piece getChessPiece(Coordinate loc){
        return board[loc.getX()][loc.getY()];
    }
    public void setChessPiece(ChessPiece piece){
        assert piece != null;
        assert piece.getLocation() != null;

        Coordinate loc = piece.getLocation();
        gameBoard[loc.getRow()][loc.getColumn()] = piece;

    }
}
// two sets of getters and setters, one for inclass stuff and one for out of class stuff.