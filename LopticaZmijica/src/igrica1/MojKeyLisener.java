package igrica1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class MojKeyLisener implements KeyListener{
   ArrayList<Komad>lista=new ArrayList<>();
   public MojKeyLisener(ArrayList<Komad> lista) {
	   this.lista=lista;
   }
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==KeyEvent.VK_RIGHT)	{
			
				lista.get(0).POMERAJX=10;
				lista.get(0).POMERAJY=0;
				
		}	
		if(arg0.getKeyCode()==KeyEvent.VK_LEFT)	{
			lista.get(0).POMERAJX=-10;
			lista.get(0).POMERAJY=0;
		}
		if(arg0.getKeyCode()==KeyEvent.VK_UP)	{
			lista.get(0).POMERAJY=-10;
			lista.get(0).POMERAJX=0;
		}
		if(arg0.getKeyCode()==KeyEvent.VK_DOWN)	{
			lista.get(0).POMERAJY=10;
			lista.get(0).POMERAJX=0;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
