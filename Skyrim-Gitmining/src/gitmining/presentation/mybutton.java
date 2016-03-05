package gitmining.presentation;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class mybutton extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setIMG(final ImageIcon imgEnter,final ImageIcon imgExit,final ImageIcon imgPress){
		imgEnter.setImage(imgEnter.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_DEFAULT));
		imgExit.setImage(imgExit.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_DEFAULT));
		imgPress.setImage(imgPress.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_DEFAULT));
		setIcon(imgExit);
		this.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setIcon(imgEnter);
			}
			public void mouseExited(MouseEvent e) {
				setIcon(imgExit);
			}
			public void mousePressed(MouseEvent e) {
				setIcon(imgPress);
			}
			public void mouseReleased(MouseEvent e){
				setIcon(imgEnter);
			}
		});
	}
}
