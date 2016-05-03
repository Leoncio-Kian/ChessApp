package ChessPiecePackage;

import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;
import MovementPackage.MoveCommand;

/**
 * Created by leonc on 2/13/2016.
 */
public class Knight extends ChessPiece {

    public Knight(Color color, Coordinate location){
        this.color = color;
        this.location = location;
    }
    public int MovePiece(MoveCommand moveCommand){
        return 0;
    }
}
