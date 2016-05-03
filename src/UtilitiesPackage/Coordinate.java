package UtilitiesPackage;

/**
 * Created by leonc on 2/8/2016.
 */
public class Coordinate {
    private int row;
    private int column;

    public Coordinate(int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getRow(){
        return row;
    }
    public void setRow(int row){
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column){
        this.column = column;
    }
    public void setCoordinate(int row, int column){
        this.row = row;
        this.column = column;
    }

}
