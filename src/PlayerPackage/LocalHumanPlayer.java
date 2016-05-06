package PlayerPackage;

import ChessPiecePackage.Piece;
import UtilitiesPackage.Color;
import UtilitiesPackage.Coordinate;

import java.util.ArrayList;

/**
 * Created by leonc on 5/6/2016.
 */
public class LocalHumanPlayer implements Player{
    private ArrayList<Coordinate> chessPieceList;
    private Color playerColor;
    public LocalHumanPlayer(Color playerColor, ArrayList<Coordinate> chessPieceList){
        this.playerColor = playerColor;
        this.chessPieceList = chessPieceList;
    }
    public void makeMove(){
        //this will do something i promise.
    }
    public ArrayList<Coordinate> getPieces () {
        return chessPieceList;
    }
}
