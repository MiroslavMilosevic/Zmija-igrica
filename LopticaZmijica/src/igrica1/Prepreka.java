package igrica1;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.Random;

public class Prepreka {

	
    public int velicinaPrepreke=20;
    public int pocetnaPozicija=300;
	
	int x=pocetnaPozicija;
	int y=pocetnaPozicija;
	
	
	
	
	public Rectangle2D vratiPrepreku() {
		
		return new Rectangle2D.Double(x,y,velicinaPrepreke,velicinaPrepreke);
	}

}
