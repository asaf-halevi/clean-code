package basics;

public class Board {

    private char[][] board;

    public Board() {
        board = new char[3][3];
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                board[y][x] = ' ';
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void setMove(int x, int y, char v) {
        board[x][y] = v;
    }
}
