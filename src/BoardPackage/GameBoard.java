package BoardPackage;

import ChessPiecePackage.*;
import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;
import UtilitiesPackage.Direction;
import java.util.*;
/**
 * Created by leonc on 2/8/2016.
 */
public class GameBoard {
    private Piece[][] board;
    private ArrayList<Coordinate> blackSide;
    private ArrayList<Coordinate> whiteSide;
    private Coordinate whiteKingLocation;
    private Coordinate blackKingLocation;
    private final int BOARD_LENGTH = 8;
    public GameBoard(){
        board = new Piece[BOARD_LENGTH][BOARD_LENGTH];
        blackSide = new ArrayList<Coordinate>();
        whiteSide = new ArrayList<Coordinate>();
    }
    public void init(){
        for(int i = 0; i < BOARD_LENGTH; i++ ){
            setChessPiece(new Coordinate(1,i), new Pawn("ChessPieces.Pawn", Color.WHITE, false, false, Direction.UP));
            setChessPiece(new Coordinate(6,i), new Pawn("ChessPieces.Pawn", Color.BLACK, false, false, Direction.DOWN));
        }
        setChessPiece(new Coordinate(0,0), new ChessPiece("Rook", Color.WHITE, false));
        setChessPiece(new Coordinate(0,7), new ChessPiece("Rook", Color.WHITE, false));
        setChessPiece(new Coordinate(7,0), new ChessPiece("Rook", Color.BLACK, false));
        setChessPiece(new Coordinate(7,7), new ChessPiece("Rook", Color.BLACK, false));

        setChessPiece(new Coordinate(0,1), new ChessPiece("Knight", Color.WHITE, false));
        setChessPiece(new Coordinate(0,6), new ChessPiece("Knight", Color.WHITE, false));
        setChessPiece(new Coordinate(7,1), new ChessPiece("Knight", Color.BLACK, false));
        setChessPiece(new Coordinate(7,6), new ChessPiece("Knight", Color.BLACK, false));

        setChessPiece(new Coordinate(0,2), new ChessPiece("Bishop", Color.WHITE, false));
        setChessPiece(new Coordinate(0,5), new ChessPiece("Bishop", Color.WHITE, false));
        setChessPiece(new Coordinate(7,2), new ChessPiece("Bishop", Color.BLACK, false));
        setChessPiece(new Coordinate(7,5), new ChessPiece("Bishop", Color.BLACK, false));

        whiteKingLocation = new Coordinate(0,4);
        blackKingLocation = new Coordinate(7,4);

        setChessPiece(whiteKingLocation, new ChessPiece("ChessPieces.King", Color.WHITE, false));
        setChessPiece(blackKingLocation, new ChessPiece("ChessPieces.King", Color.BLACK, false));
    }
    public boolean checkChessPiece(Coordinate loc){
        if(board[loc.getX()][loc.getY()] == null)
            return false;
        else
            return true;
    }
    public int removeChessPiece(Coordinate loc){
        //currently the checks are redundant with movechesspiece()
        if(!checkValidCoordinate(loc))
            return -1;
        if(!checkChessPiece(loc))
            return -2;
        board[loc.getX()][loc.getY()] = null;
        return 0;
    }
    public boolean checkValidCoordinate(Coordinate loc){
        if(loc.getX() < 0 || loc.getX() > 7 || loc.getY() < 0 || loc.getY() > 7)
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
    public void setChessPiece(Coordinate loc, Piece chessPiece){
        if(chessPiece != null)
            board[loc.getX()][loc.getY()] = chessPiece;
        if(chessPiece.getColor() == Color.WHITE)
            whiteSide.add(chessPiece);
        else
            blackSide.add(chessPiece);
    }
    public ArrayList<Coordinate> getWhiteSide(){
        return whiteSide;
    }
    public ArrayList<Coordinate> getBlackSide(){
        return blackSide;
    }

    //The following is an example main i used to unit test the gameboard and related parts.

    public static void main(String[] args) {
        BoardPackage.GameBoard board = new BoardPackage.GameBoard();
        UnitTest test = new UnitTest();
        test.printBoard(board);
        board.moveChessPiece(new UtilitiesPackage.Coordinate(1,1), new UtilitiesPackage.Coordinate(2, 1));
        test.printBoard(board);
        System.out.println(board.checkValidCoordinate(new UtilitiesPackage.Coordinate(9,0)));
        System.out.println(board.checkValidCoordinate(new UtilitiesPackage.Coordinate(-1, 3)));
        System.out.println(board.checkValidCoordinate(new UtilitiesPackage.Coordinate(3,34)));
        System.out.println( board.checkValidCoordinate(new UtilitiesPackage.Coordinate(5, -3)));
    }


}
/*
* The following is a class used in conjunction with the sample main above to test the gameboard design.
*/
class UnitTest{
    public void printBoard(BoardPackage.GameBoard board){
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece iter = board.getChessPiece(new UtilitiesPackage.Coordinate(i, j));
                if(iter != null)
                    System.out.print( "[" + iter.getName() + "\t]");
                else
                    System.out.print("[       ]");
            }
            System.out.println();
        }
    }

}
