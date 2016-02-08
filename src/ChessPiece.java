/**
 * Created by leonc on 2/7/2016.
 */
public class ChessPiece implements Piece{
    private String name;
    private Color color;
    private boolean hasMoved;

    public ChessPiece(String name, Color color, boolean hasMoved){
        this.name = name;
        this.color = color;
        this.hasMoved = hasMoved;
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

}
