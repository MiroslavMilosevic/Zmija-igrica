package igrica1;

import java.awt.Color;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		
		ArrayList<Komad> lista=new ArrayList<>();
		MojKeyLisener mkl=new MojKeyLisener(lista);
		
	
		
		for (int i=0;i<20;i++) {
			lista.add(new Komad());
		}
		Prepreka prepreka=new Prepreka();
	
        Okvir okvir=new  Okvir();
		Panel panel=new Panel(lista,prepreka);
		panel.setBackground(Color.BLACK);
		
		panel.addKeyListener(mkl);
		okvir.add(panel);
		okvir.setVisible(true);
		
		int brojacZbogGreske=1;
		int brojacWhilePetlje=0;
		while(brojacWhilePetlje==0) {     //glavna for petlja
			brojacZbogGreske++;
			if(brojacZbogGreske>50) {
			brojacWhilePetlje=panel.Sudar();}
			for(int w=0;w<lista.size();w++) {
				if(((lista.get(w).x)>panel.getWidth())) {
					lista.get(w).x=-10;   }
				
				if((lista.get(w).x<-10)) {
				lista.get(w).x=panel.getWidth();   }
				
				if(((lista.get(w).y)>panel.getHeight())) {
					lista.get(w).y=-10;   }
				
				if((lista.get(w).y<-10)) {
				lista.get(w).y=panel.getHeight();   }
			}
			if( ((lista.get(0).x+10>=prepreka.x)&&(lista.get(0).x+10<=prepreka.x+20))&&((lista.get(0).y+10>=prepreka.y)&&(lista.get(0).y+10<=prepreka.y+20))||
			((lista.get(0).x>=prepreka.x)&&(lista.get(0).x<=prepreka.x+20))&&((lista.get(0).y>=prepreka.y)&&(lista.get(0).y<=prepreka.y+20)) ) {
				panel.RandomPozicija();
				lista.add(new Komad("BILO KOJI STRING"));
				lista.add(new Komad("BILO KOJI STRING"));
				
				
			}
				
			
			
			lista.get(0).pomeriKockicu();
		//	komad.pomeriKockicu();
			panel.PomeriCeluListu();
			
			panel.repaint();
		try {	Thread.sleep(50); }catch(Exception e) {e.printStackTrace();}
			
			
		}
	
		
	}

		}
