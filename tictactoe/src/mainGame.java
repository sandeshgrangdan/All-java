

import java.util.Scanner;

public class mainGame {
	Seed currentPlayer;
	Board board;
	GameState currentState;
	Scanner in;

	public mainGame() {
		board = new Board();
		in = new Scanner(System.in);
		initGame();
		while (currentState == GameState.PLAYING) {
			movePlayer(currentPlayer);
			board.draw();
			updateGameStatus(currentPlayer);
			if (currentPlayer == Seed.CROSS)
				currentPlayer = Seed.ZERO;
			else
				currentPlayer = Seed.CROSS;
		}
		if (currentState == GameState.CROSS_WON) {
			System.out.println("The game is won by: cross");
			board.draw();
		} else if (currentState == GameState.ZERO_WON) {
			System.out.println("The game is won by: cross");
			board.draw();
		} else {
			System.out.println("The game is draw");
			board.draw();
		}

	}

	public void initGame() {
		currentPlayer = Seed.CROSS;
		board.init();
		currentState = GameState.PLAYING;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainGame();

	}

	public void movePlayer(Seed player) {
		int row, column;
		Boolean invalid;
		do {
			if (player == Seed.CROSS)
				System.out
						.println("Player X: please your move [1 to 3] [1 to 3] (1 2)");
			else if (player == Seed.ZERO)
				System.out
						.println("Player 0: please your move [1 to 3] [1 to 3] (1 2)");
			row = in.nextInt() - 1;
			column = in.nextInt() - 1;
			if ((invalid = row > Board.ROW - 1 || row < 0
					|| column > Board.COL - 1 || column < 0)) {
				System.out.println("Invalid input...Enter input between 1-3");
			} else {
				if ((invalid = board.cells[row][column].value != Seed.EMPTY)) {
					System.out.println("The cell is already drawn with: "
							+ board.cells[row][column].value);
				}
			}
		} while (invalid);
		board.currentRow = row;
		board.currentCol = column;
		board.cells[row][column].value = player;

	}

	public void updateGameStatus(Seed player) {
		if (board.isGameWon(player)) {
			currentState = (player == Seed.CROSS) ? GameState.CROSS_WON
					: GameState.ZERO_WON;
		}
		if (board.isGameDraw(player)) {
			currentState = GameState.DRAW;
		}
	}

}
