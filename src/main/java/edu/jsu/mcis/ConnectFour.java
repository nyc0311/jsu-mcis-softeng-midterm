package edu.jsu.mcis;

public class ConnectFour {
    public enum Location {EMPTY, RED, BLACK};
    public enum Result { NONE, RED_WIN, BLACK_WIN, TIE }
    public static final int COLUMNS = 7;
	public static final int ROWS = 6;
	private Token[][] board;
	private boolean redTurn;
    public ConnectFour() {
         board = new Token[ROWS][COLUMNS];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = Token.EMPTY;
            }
        }
        redTurn = true;
    }
    
    public Location getTopOfColumn(int column) {
        return Token.Empty;
    }
    
    public int getHeightOfColumn(int column) {
        return 0;
    }
    
    public void dropToken(int column) {
         return true;
    }
	
	public classColumnFullException {
    public ColumnFullException(int flag){
       if();
    }
}

}