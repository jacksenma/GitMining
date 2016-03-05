package gitmining.presentation;

import java.awt.Graphics;

import javax.swing.JPanel;

public class drawTypePanel  extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {			
        super.paintComponent(g);
        g.drawImage(AllImages.typebg.getImage(), 0, 0,null);
}
}
