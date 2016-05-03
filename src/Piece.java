import UtilitiesPackage.Color;

/**
 * Created by leonc on 2/3/2016.
 */
public interface Piece {
    String getName();
    void setName(String name);
    Color getColor();
    void setColor(Color color);
    boolean getHasMoved();
    void setHasMoved(boolean hasMoved);
}
