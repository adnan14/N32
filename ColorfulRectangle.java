import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorfulRectangle {

	public static void main(String[] args) {
		
		Canvas canvasPanel = new Canvas();

		JFrame mainWindow = new JFrame("Sareni pravougaonik!"); // naziv prozora; probaj bez naziva!
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(300,200); // probaj bez parametara!
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
	}
	
	public static class Canvas extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
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
		
	
	private static int slucajnaBoja() {
		
		return 30;
		
//		for (int i = 0; i < nizZaUnos.length; i++) { // UPAMTI OVO!! Ovdje je bio problem!
//			for (int j = 0; j < nizZaUnos[i].length; j++) {
//
//				System.out.printf("%d ", nizZaUnos[i][j]);
//			}
//			System.out.println();
//		}
	}	
		
		
		
		
		
	}

}
