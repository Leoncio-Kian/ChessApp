/**
 * Created by leonc on 2/8/2016.
 */
public class Pawn implements Piece {


    private String name;
    private Color color;
    private boolean hasMoved;
    private boolean enPassant;
    private Direction direction;
    public Pawn(String name, Color color, boolean hasMoved, boolean enPassant, Direction direction){
        this.name = name;
        this.color = color;
        this.hasMoved = hasMoved;
        this.enPassant = enPassant;
        this.direction = direction;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public boolean getHasMoved(){
        return hasMoved;
    }
    public void setHasMoved(boolean hasMoved){
        this.hasMoved = hasMoved;
    }
    public boolean getEnPassant(){
        return enPassant;
    }
    public void setEnPassant(boolean enPassant){
        this.enPassant = enPassant;
    }
    public Direction getDirection(){
        return direction;
    }
    public void setDirection(Direction direction){
        this.direction = direction;
    }

}
