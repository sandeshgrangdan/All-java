

public class Board {
	public static final int ROW = 3, COL = 3;
	int currentRow, currentCol;
	Cell[][] cells;

	public Board() {
		cells = new Cell[ROW][COL];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				cells[i][j] = new Cell();
			}
		}
	}

	public void init() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				cells[i][j].clearCell();
			}
		}
	}

	public void draw() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				cells[i][j].paint();
				if (j < COL - 1) {
					System.out.print("|");
				}

			}
			System.out.println();
			if (i < ROW - 1) {
				System.out.println("------");
			}
		}
	}

	public boolean isGameWon(Seed player) {
		return ((cells[currentRow][0].value == cells[currentRow][1].value && cells[currentRow][1].value == cells[currentRow][2].value)
				|| (cells[0][currentCol].value == cells[1][currentCol].value && cells[1][currentCol].value == cells[2][currentCol].value)
				|| (cells[0][0].value == player && cells[1][1].value == player && cells[2][2].value == player) 
				|| (cells[2][0].value == player&& cells[0][2].value == player && cells[1][1].value == player));
	}

	public boolean isGameDraw(Seed player) {
		boolean a = true;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				a = a && cells[i][j].value != Seed.EMPTY;

			}
		}
		return a;

	}
}
