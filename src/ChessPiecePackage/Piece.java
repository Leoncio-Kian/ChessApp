package ChessPiecePackage;

import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;
import MovementPackage.MoveCommand;

/**
 * Created by leonc on 2/7/2016.
 */
public abstract class Piece {
    final Color White = Color.WHITE;
    final Color Black = Color.BLACK;

    protected Color color;
    protected Coordinate location;

    public abstract int MovePiece(MoveCommand moveCommand);

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public Coordinate getLocation(){ return location;}
    public void setLocation(Coordinate location){ this.location = location;}
    public void setLocation(int row, int column){ location.setCoordinate(row, column);}

}
