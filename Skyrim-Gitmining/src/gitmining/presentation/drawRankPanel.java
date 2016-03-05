package gitmining.presentation;

import java.awt.Graphics;

import javax.swing.JPanel;

public class drawRankPanel  extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {			
        super.paintComponent(g);
        g.drawImage(AllImages.rankbg.getImage(), 0, 0,null);
}
}
