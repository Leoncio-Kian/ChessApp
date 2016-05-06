package MovementPackage;

import ChessPiecePackage.*;
import UtilitiesPackage.Coordinate;

/**
 * Created by leonc on 2/13/2016.
 */
public abstract class MoveCommand {
    private Coordinate startLoc;
    private Coordinate endLoc;
    private Piece piece;

    public void setStartLoc(Coordinate startLoc){ this.startLoc = startLoc;}
    public void setStartLoc(int row, int column ){ this.startLoc.setCoordinate(row, column);}
    public void setEndLoc(Coordinate endLoc){ this.endLoc = endLoc;}
    public void setEndLoc(int row, int column){ this.endLoc.setCoordinate(row, column);}
    public void setChessPiece(Piece piece){ this.piece = piece;}

    public Coordinate getStartLoc(){ return startLoc;}
    public Coordinate getEndLoc(){ return endLoc;}
    public Piece getPiece(){ return piece;}

    public abstract void execute();
    public abstract void undo();
}
