package igrica1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

//import javafx.scene.layout.Pane;

public class Panel extends JPanel {
	ArrayList<Komad> lista=new ArrayList<>();
	Prepreka prepreka;
	
	public Panel(ArrayList<Komad> lista,Prepreka prepreka) {
		this.lista=lista;
		this.prepreka=prepreka;
		setFocusable(true);		
	}
	public void RandomPozicija() {
		Random r=new Random();
		int randomX=r.nextInt(getWidth()-20);
		int randomY=r.nextInt(getHeight()-20);
		prepreka.x=randomX;
		prepreka.y=randomY;
		
	}
	
	public void PomeriCeluListu() {
		
		for (int i=lista.size()-1;i>0;i--) {
			
			lista.get(i).x=lista.get(i-1).x;
			lista.get(i).y=lista.get(i-1).y;
			
		}
	}
	public void PomeriPrviClan() {
		lista.get(0).x += lista.get(0).POMERAJX;
		lista.get(0).y += lista.get(0).POMERAJY;
	}
	
	
	
	public int Sudar() {
		int brojac=0;
		for(int i=2;i<lista.size();i++) {
			if((lista.get(0).x==lista.get(i).x)&&(lista.get(0).y==lista.get(i).y)) {
				brojac=1;
			}
		}
		return brojac;

	}
	

	
	
	protected void paintComponent(Graphics arg0) {	
		super.paintComponent(arg0);
		Graphics2D g2=(Graphics2D)arg0;
		g2.setColor(Color.RED);
		for (int i=0;i<lista.size();i++) {
		g2.fill(lista.get(i).vratiKockicu());		
		}
		g2.setColor(Color.GREEN);
		g2.fill(prepreka.vratiPrepreku());
	}

}
