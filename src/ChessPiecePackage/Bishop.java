package ChessPiecePackage;

import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;
import MovementPackage.MoveCommand;

/**
 * Created by leonc on 2/13/2016.
 */
public class Bishop extends ChessPiece {

    public Bishop(Color color, Coordinate location){
        super.color = color;
        super.location = location;
    }
    public int MovePiece(MoveCommand moveCommand){
        return 0;
    }
}
