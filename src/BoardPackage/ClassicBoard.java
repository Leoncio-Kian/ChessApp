package BoardPackage;

/**
 * Created by leonc on 5/7/2016.
 */

import ChessPiecePackage.*;
import UtilitiesPackage.*;

public class ClassicBoard implements Board {
    private final int BOARD_LENGTH = 8;

    private Piece gameBoard[][];

    public ClassicBoard() {
        this.gameBoard = new Piece[BOARD_LENGTH][BOARD_LENGTH];
    }
    public void setChessPiece(Piece chessPiece, Coordinate location){
        assert ValidCoordinate(location);

        gameBoard[location.getRow()][location.getColumn()] = chessPiece;
    }
    public Piece getChessPiece(Coordinate location){
        return gameBoard[location.getRow()][location.getColumn()];
    }
    public boolean ValidCoordinate(Coordinate loc){
        if(loc == null)
            return false;
        if(loc.getRow() < 0 || loc.getRow() > 7 || loc.getColumn() < 0 || loc.getColumn() > 7) {

            throw new IllegalArgumentException();
        }
        return true;
    }
}
