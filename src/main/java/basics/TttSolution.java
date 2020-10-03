package basics;

/**
 * Tic-Tac-Toe
 * @author Asaf
 *
 */
public class TttSolution {

	private static final int BOARD_SIZE = 3;

	public boolean isVictory(Board board, char currentPlayer) {
		return (isHorizontalVictory(board.getBoard(), currentPlayer)) || (isVerticalVictory(board.getBoard(), currentPlayer)) || (isDiagonalVictory(board.getBoard(), currentPlayer));
	}

	private boolean isHorizontalVictory(char[][] board, char currentPlayer) {
		boolean isVictory = false;
		for (int row=0; row < BOARD_SIZE && !isVictory; row++) {
			if (isFullRow(board, currentPlayer, row)) {
				isVictory = true;
			}
		}
		return isVictory;
	}

	private boolean isVerticalVictory(char[][] board, char currentPlayer) {
		boolean isVictory = false;
		for (int column=0; column < BOARD_SIZE && !isVictory; column++) {
			if (isFullColumn(board, currentPlayer, column)) {
				isVictory = true;
			}
		}
		return isVictory;
	}

	private boolean isDiagonalVictory(char[][] board, char currentPlayer) {
		return (board[1][1] == currentPlayer) &&
				((board[0][0] == currentPlayer && board[2][2] == currentPlayer) || (board[0][2] == currentPlayer && board[2][0] == currentPlayer));
	}

	private boolean isFullColumn(char[][] board, char currentPlayer, int x) {
		return board[0][x] == currentPlayer && board[1][x] == currentPlayer && board[2][x] == currentPlayer;
	}

	private boolean isFullRow(char[][] board, char currentPlayer, int y) {
		return board[y][0] == currentPlayer && board[y][1] == currentPlayer && board[y][2] == currentPlayer;
	}

}
