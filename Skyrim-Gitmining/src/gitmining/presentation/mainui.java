package gitmining.presentation;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class mainui extends JFrame {

	private static mainui frame;
	private static mybutton start=new mybutton();
	private static mybutton exit=new  mybutton();
	private static mybutton min=new  mybutton();
	private static JPanel panel=new JPanel();

	public mainui getFrame(){
		return frame;
	}
	public static void init(){
		
		frame.setSize(1000,550);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setResizable(false);
		
		min.setSize((int)((double)frame.getWidth()*18/490),(int)((double)frame.getHeight()*22/490));
		min.setLocation(frame.getWidth()-2*min.getWidth(),0);
		min.setIMG(AllImages.minmove,AllImages.min,AllImages.minclick);
		min.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				frame.setExtendedState(Frame.ICONIFIED);
			}
		});
		
		exit.setSize((int)((double)frame.getWidth()*18/490),(int)((double)frame.getHeight()*22/490));
		exit.setLocation(frame.getWidth()-exit.getWidth(),0);
		exit.setIMG(AllImages.exitclick,AllImages.exit,AllImages.exitclick);
		exit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				System.exit(0);
			}
		});
		
		start.setSize(100,50);
		start.setLocation(400,350);
		start.setIMG(AllImages.confirm1, AllImages.confirm2,AllImages.confirm3);
		start.addMouseListener(new MouseAdapter(){          //从初始界面跳转到工作界面
			public void mouseClicked(MouseEvent e){
				frame.dispose();
				uicontroller.startworkui();			 
			}
		});
		
		frame.setContentPane(panel);
		panel.setLayout(null);
		panel.add(start);
		panel.add(exit);
		panel.add(min);
		panel.setOpaque(false);
		
		frame.setVisible(true);
	}
	
	public static mainui creatframe(){
		frame = new mainui();
		return frame;
	}

}
