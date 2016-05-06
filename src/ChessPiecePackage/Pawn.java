package ChessPiecePackage;

import UtilitiesPackage.*;
import MovementPackage.MoveCommand;

/**
 * Created by leonc on 2/8/2016.
 */
public class Pawn extends Piece {
    private boolean hasMoved;
    private boolean enPassant;
    private Direction direction;
    public Pawn(Color color, Coordinate location, Direction direction){
        super.color = color;
        super.location = location;
        this.hasMoved = false;
        this.enPassant = false;
        this.direction = direction;
    }

    public Pawn(Color color, Coordinate location, boolean hasMoved, boolean enPassant, Direction direction){
        super.color = color;
        super.location = location;
        this.hasMoved = hasMoved;
        this.enPassant = enPassant;
        this.direction = direction;
    }

    public int MovePiece(MoveCommand moveCommand){
        return 0;
    }
    public boolean getHasMoved(){ return hasMoved; }
    public boolean getEnPassant(){ return enPassant; }
    public Direction getDirection(){ return direction; }
    public void setHasMoved(boolean hasMoved){ this.hasMoved = hasMoved; }
    public void setEnPassant(boolean enPassant){ this.enPassant = enPassant; }
    public void setDirection(Direction direction){ this.direction = direction; }

}
