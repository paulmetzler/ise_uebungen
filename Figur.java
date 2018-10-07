package schach;

public abstract class Figur extends Mannschaft {
	protected int x;
	protected int y;
	Figur(Farbe farbe, int x, int y) {
		super(farbe);
		this.x = x;
		this.y = y;
	}

	public abstract void moveTo(int x, int y);
}
