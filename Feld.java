package schach;

public class Feld extends Schachbrett{
	private int x;
	private int y;
	private Farbe farbe;
	
	public Feld(String name, int x, int y, Farbe farbe) {
		super(name);
		this.x = x;
		this.y = y;
		this.farbe = farbe;
	}
}
