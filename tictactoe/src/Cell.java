

public class Cell {
	Seed value;

	public Cell() {
		clearCell();
	}

	public void clearCell() {
		this.value = Seed.EMPTY;
	}

	public void paint() {
		if (this.value == Seed.CROSS)
			System.out.print("X");
		else if (this.value == Seed.ZERO)
			System.out.print("0");
		else
			System.out.print(" ");
	}
}
