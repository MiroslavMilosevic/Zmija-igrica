package igrica1;

import java.awt.geom.Rectangle2D;

public class Komad {

	public static int velicina = 10;
	public int POMERAJX = 10;
	public int POMERAJY = 0;

	int x = 50;
	int y = 50;

	public Komad(String s) {
		x = -50;
		y = -50;

	}

	public Komad() {
	}

	public void pomeriKockicu() {
		x += POMERAJX;
		y += POMERAJY;
	}

	public Rectangle2D vratiKockicu() {

		return new Rectangle2D.Double(x, y, velicina, velicina);

	}

}
