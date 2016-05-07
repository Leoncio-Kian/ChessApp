package ChessPiecePackage;

import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;
//import MovementPackage.MoveCommand;

/**
 * Created by leonc on 2/13/2016.
 */
public class King extends Piece {
    private boolean hasMoved;
    public King(Color color, Coordinate location){
        super.color = color;
        super.location = location;
        this.hasMoved = false;
    }
    public King(Color color, Coordinate location, boolean hasMoved){
        super.color = color;
        super.location = location;
        this.hasMoved = hasMoved;
    }
//    public int MovePiece(MoveCommand moveCommand){
//        return 0;
//    }
    public boolean getHasMoved(){ return hasMoved; }
    public void setHasMoved(boolean hasMoved){ this.hasMoved = hasMoved; }
    public String toString(){ return "Ki";}
}
