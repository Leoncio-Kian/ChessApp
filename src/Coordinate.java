/**
 * Created by leonc on 2/8/2016.
 */
public class Coordinate {
    private int x;
    private int y;

    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setCoordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

}
