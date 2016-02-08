/**
 * Created by leonc on 2/8/2016.
 */
public class GameBoard {
    private Piece[][] board;
    final int BOARDLENGTH = 8;
    public GameBoard(){
        board = new Piece[BOARDLENGTH][BOARDLENGTH];
        init();
    }
    public void init(){
        for(int i = 0; i < BOARDLENGTH; i++ ){
            board[1][i] = new Pawn("Pawn", Color.WHITE, false, false, Direction.UP);
            board[6][i] = new Pawn("Pawn", Color.BLACK, false, false, Direction.DOWN);
        }
        board[0][0] = new ChessPiece("Rook", Color.WHITE, false);
        board[0][7] = new ChessPiece("Rook", Color.WHITE, false);
        board[7][0] = new ChessPiece("Rook", Color.BLACK, false);
        board[7][7] = new ChessPiece("Rook", Color.BLACK, false);

        board[0][1] = new ChessPiece("Knight", Color.WHITE, false);
        board[0][6] = new ChessPiece("Knight", Color.WHITE, false);
        board[7][1] = new ChessPiece("Knight", Color.BLACK, false);
        board[7][6] = new ChessPiece("Knight", Color.BLACK, false);

        board[0][2] = new ChessPiece("Bishop", Color.WHITE, false);
        board[0][5] = new ChessPiece("Bishop", Color.WHITE, false);
        board[7][2] = new ChessPiece("Bishop", Color.BLACK, false);
        board[7][5] = new ChessPiece("Bishop", Color.BLACK, false);

        board[0][4] = new ChessPiece("King", Color.WHITE, false);
        board[0][3] = new ChessPiece("Queen", Color.WHITE, false);
        board[7][4] = new ChessPiece("King", Color.BLACK, false);
        board[7][3] = new ChessPiece("Queen", Color.BLACK, false);
    }
    public boolean checkChessPiece(Coordinate loc){
        if(board[loc.getX()][loc.getY()] == null)
            return false;
        else
            return true;
    }

    public Piece getChessPiece(Coordinate loc){
        return board[loc.getX()][loc.getY()];

    }
    public void setChessPiece(Coordinate loc, Piece chessPiece){
        if(chessPiece != null)
            board[loc.getX()][loc.getY()] = chessPiece;
    }
    public boolean checkValidCoordinate(Coordinate loc){
        if(loc.getX() < 0 || loc.getX() > 7 || loc.getY() < 0 || loc.getY() > 7)
            return false;
        return true;
    }
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(board.getChessPiece(new Coordinate(i, j)));
            }
            System.out.println();
        }
    }
}
