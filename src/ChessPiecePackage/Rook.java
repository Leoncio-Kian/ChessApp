package ChessPiecePackage;

import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;
//import MovementPackage.MoveCommand;

/**
 * Created by leonc on 2/13/2016.
 */
public class Rook extends Piece {
    private boolean hasMoved;
    public Rook(Color color, Coordinate location){
        this.color = color;
        this.location = location;
        this.hasMoved = false;
    }
    public Rook(Color color, Coordinate location, boolean hasMoved){
        this.color = color;
        this.location = location;
        this.hasMoved = hasMoved;
    }
//    public int MovePiece(MoveCommand moveCommand){
//        return 0;
//    }
    public boolean getHasMoved(){ return hasMoved; }
    public void setHasMoved(boolean hasMoved){ this.hasMoved = hasMoved; }
    public String toString(){ return "Rk";}
}
