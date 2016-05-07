package GamePackage;

import UtilitiesPackage.*;
//import PlayerPackage.Player;
import ChessPiecePackage.*;
import BoardPackage.Board;
import BoardPackage.ClassicBoard;
/**
 * Created by leonc on 2/13/2016.
 */
public class ClassicChess implements Game{
//    private Player WhitePlayer;
//    private Player BlackPlayer;

    //private GameView gameView;

    //the following are constants.

    private final Color White = Color.WHITE;
    private final Color Black = Color.BLACK;
    private final int BOARD_LENGTH = 8;

    Board gameBoard;

    public ClassicChess(){
        gameBoard = new ClassicBoard();
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

        for(int column = 0; column < BOARD_LENGTH; column++ ){
            setChessPiece(new Pawn( White, new Coordinate(1,column)));
            setChessPiece(new Pawn( Black, new Coordinate(6,column)));
            for(int row = 2; row < 6; row++){
                removeChessPiece(new Coordinate(row, column));
            }
        }
        setChessPiece( new Rook( White, new Coordinate(0,0)) );
        setChessPiece( new Rook( White, new Coordinate(0,7)) );
        setChessPiece( new Rook( Black, new Coordinate(7,0)) );
        setChessPiece( new Rook( Black, new Coordinate(7,7)) );

        setChessPiece( new Knight( White, new Coordinate(0,1)) );
        setChessPiece( new Knight( White, new Coordinate(0,6)) );
        setChessPiece( new Knight( Black, new Coordinate(7,1)) );
        setChessPiece( new Knight( Black, new Coordinate(7,6)) );

        setChessPiece( new Bishop( White, new Coordinate(0,2)) );
        setChessPiece( new Bishop( White, new Coordinate(0,5)) );
        setChessPiece( new Bishop( Black, new Coordinate(7,2)) );
        setChessPiece( new Bishop( Black, new Coordinate(7,5)) );

        setChessPiece( new King( White, new Coordinate(0,4)) );
        setChessPiece( new Queen( White, new Coordinate(0,3)) );
        setChessPiece( new King( Black, new Coordinate(7,4)) );
        setChessPiece( new Queen( Black, new Coordinate(7,3)) );
    }
    public boolean checkChessPiece(Coordinate location){
        assert ValidCoordinate(location);

        return gameBoard.getChessPiece(location) == null;
    }
    public void removeChessPiece(Coordinate location){
        assert ValidCoordinate(location);

        gameBoard.setChessPiece(null, location);

    }

    public int moveChessPiece(Coordinate startLoc, Coordinate endLoc){
        //check to make sure that the starting and ending coordinates are valid
        if(!ValidCoordinate(startLoc) || !ValidCoordinate(endLoc))
            return 1;
        //check to make sure that there is a chess piece in the starting coordinates.
        if(!checkChessPiece(startLoc))
            return 2;
        //The chess piece is obtained from the start coordinates.
        Piece chessPiece = getChessPiece(startLoc);
        //the chess piece has its location updated FIRST.
        chessPiece.updateLocation(endLoc);
        //the chess piece is moved to the new location.
        setChessPiece(endLoc, chessPiece);
        //the chess piece is removed from the old location.
        removeChessPiece(startLoc);
        return 0;
    }
    public Piece getChessPiece(Coordinate location){
        assert ValidCoordinate(location);

        return gameBoard.getChessPiece(location);
    }
    public void setChessPiece(Coordinate endLoc, Piece piece){
        assert piece != null;
        assert endLoc != null;
        assert endLoc.getRow() == piece.getLocation().getRow() && endLoc.getColumn() == piece.getLocation().getColumn();

        gameBoard.setChessPiece(piece, endLoc);
    }
    //alternate setChessPiece method for initialization of pieces.
    public void setChessPiece(Piece piece) {
        assert piece != null;
        assert piece.getLocation() != null;

        //get the end location from the chess piece.
        Coordinate endLoc = piece.getLocation();
        //it will put a chesspiece in the location it is in.
        gameBoard.setChessPiece(piece, endLoc);

    }
    public boolean ValidCoordinate(Coordinate location){
        return gameBoard.ValidCoordinate(location);
    }
//The following is an example main i used to unit test the gameboard and related parts.

    public static void main(String[] args) {
        ClassicChess classicChessGame = new ClassicChess();
        UnitTest test = new UnitTest();
        test.printBoard(classicChessGame);
        classicChessGame.moveChessPiece(new Coordinate(1,1), new Coordinate(2, 1));
        test.printBoard(classicChessGame);
        classicChessGame.initializeBoard();
        test.printBoard(classicChessGame);
        System.out.println(classicChessGame.ValidCoordinate(new Coordinate(9,0)));
//        System.out.println(classicChessGame.ValidCoordinate(new Coordinate(-1, 3)));
//        System.out.println(classicChessGame.ValidCoordinate(new Coordinate(3,34)));
//        System.out.println( classicChessGame.ValidCoordinate(new Coordinate(5, -3)));
    }


}

// The following is a class used in conjunction with the sample main above to test the gameboard design.
class UnitTest{
    public void printBoard(ClassicChess board){
        for(int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                Piece iter = board.getChessPiece(new UtilitiesPackage.Coordinate(row, column));
                if(iter != null)
                    System.out.print( "[" + iter.toString() + "]");
                else
                    System.out.print("[  ]");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}