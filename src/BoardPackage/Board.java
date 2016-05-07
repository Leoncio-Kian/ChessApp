package BoardPackage;

import ChessPiecePackage.Piece;
import UtilitiesPackage.Coordinate;

/**
 * Created by leonc on 5/7/2016.
 */
public interface Board {
    void setChessPiece(Piece chessPiece, Coordinate location);
    Piece getChessPiece(Coordinate location);
    boolean ValidCoordinate(Coordinate loc);
}
