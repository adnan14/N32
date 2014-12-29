import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorfulRectangle1 {

	public static void main(String[] args) {
		RepaintListener listener = new RepaintListener();
		
		Canvas canvasPanel = new Canvas();
		canvasPanel.addMouseListener(listener);

		JFrame mainWindow = new JFrame("Sareni pravougaonik!"); // naziv prozora; probaj bez naziva!
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(300,200); // probaj bez parametara!
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
	}
	

	public static class RepaintListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component)e.getSource();
			source.repaint();
		}
	
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub		
		}
	
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub		
		}
	
		@Override
		public void mouseEntered(MouseEvent e) { // kursor misa je usao u podrucje panela
			// TODO Auto-generated method stub		
		}
	
		@Override
		public void mouseExited(MouseEvent e) { // kursor misa je izasao iz podrucja panela
			// TODO Auto-generated method stub		
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
