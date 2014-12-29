import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Vjezba1 {

	public static void main(String[] args) {
		StampListener listener = new StampListener();
		
		JPanel canvasPanel = new JPanel();
		canvasPanel.setBackground(Color.WHITE);
		canvasPanel.addMouseListener(listener);

		JFrame mainWindow = new JFrame("Sareni pravougaonik!"); // naziv prozora; probaj bez naziva!
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(800, 800);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
	}
	

	public static class StampListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();
			
			// slijedi zadavanje plave boje i RANDOM vrijednosti 
			
			g.setColor(Color.BLUE);
			
			float a = (float)Math.random(); 
			a = (int)(Math.random() * 600);
			int aPola = (int)(a/2);
			
			float b = (float)Math.random(); 
			b = (int)(Math.random() * 600);
			int bPola = (int)(b/2);
			
			g.drawOval(e.getX()-aPola, e.getY()-bPola, (int)a, (int)b);
		}
	
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub	
			
			System.out.println("Tekst2");
			
		}
	
		@Override
		public void mouseReleased(MouseEvent e) {

			System.out.println("Tekst3");

		}
	
		@Override
		public void mouseEntered(MouseEvent e) { // kursor misa je usao u podrucje panela
			
			System.out.println("Tekst4");
		
		}
	
		@Override
		public void mouseExited(MouseEvent e) { // kursor misa je izasao iz podrucja panela
			
			System.out.println("Tekst5");
					
		}	
		
	}		
		
		
	
	
	public static class Canvas extends JPanel {
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// g.drawRect(50, 50, 150, 100);
			// g.setColor(Color.RED);
			// g.setColor(new Color.RED); // ovo ako hocemo neku standardnu boju
			// g.setColor (new Color(0.3f, 0.2f, 0.9f)); // ovo ako hocemo neku svoju boju
			// g.setColor (new Color(255, 95, 32)); // parametre mozemo saznati preko color.adobe.com ili sl.

			// donja 4 reda ako zelimo RANDOM vrijednosti
			g.setColor (new Color((float)Math.random(), (float)Math.random(), (float)Math.random())); 
			g.setColor (new Color((int)(Math.random() * 255),
								  (int)(Math.random() * 255),
								  (int)(Math.random() * 255)));
			
			
			g.fillRect(50,  50,  150,  100);			
			// g.fillRect(50,  50,  getWidth() - 20, getHeight() - 20);	// provjeri kako ovo radi!!
		
		}
	}

}
