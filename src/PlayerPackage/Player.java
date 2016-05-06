package PlayerPackage;


import UtilitiesPackage.Coordinate;

import java.util.ArrayList;

/**
 * Created by leonc on 2/11/2016.
 */
public interface Player {
    //an interface for all types of players (probably only human and AI
    //has a method called make move that allows it to interact with the gameboard
    //method will be void until i can think of a better return value.
    void makeMove();
    ArrayList<Coordinate> getPiece();
    //has a method called get pieces that will bring up the list of pieces (coordinates) under its control.

}
