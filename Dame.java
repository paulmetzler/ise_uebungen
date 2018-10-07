package schach;

public class Dame extends Figur{

	

	Dame(Farbe farbe, int x, int y) {
		super(farbe, x, y);
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}


}
