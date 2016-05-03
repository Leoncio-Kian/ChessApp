package PlayerPackage;

import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;

/**
 * Created by leonc on 2/11/2016.
 */
public class Player {
    private Controller controller;
    private Color color;

    public Player(Controller controller, Color color){
        this.controller = controller;
        this.color = color;
    }

    public Controller getController(){
        return controller;
    }
    public void setController(Controller controller){
        this.controller = controller;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void movePiece(Coordinate startLoc, Coordinate endLoc){
        controller.makeMoveCommand(getColor(), startLoc, endLoc);
    }

}
