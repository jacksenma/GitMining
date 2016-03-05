package gitmining.presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class workui extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static workui frame;
	private static drawGuiderPanel guiderpanel=new drawGuiderPanel();
	private static drawResultPanel resultpanel=new drawResultPanel();
	private static drawTypePanel typepanel=new drawTypePanel();
	private static drawRankPanel rankpanel=new drawRankPanel();
	private static Panel Repositoryui = new Panel();
	private static Panel Userui = new Panel();
	private static mybutton forRepository=new mybutton();
	private static mybutton forUser=new mybutton();
	private static mybutton search=new mybutton();
    private static JLabel result = new JLabel();
    
    private static JTextField input =new JTextField();
	
	public static void init() {	
		frame.setBackground(Color.WHITE);
     	frame.setSize(1000,550);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setResizable(false);
		
		input.setSize(350, 35);
		input.setLocation(146,20);
		search.setText("搜索");
		search.setSize(35,35);
		search.setLocation(500, 20);
		search.setFont(new Font("Serif",Font.PLAIN,14));
				
		forRepository.setSize(100,25);
		forRepository.setLocation(20,100);
		forRepository.setText("Repository");
		forRepository.setToolTipText("搜索项目");
		
		forUser.setSize(100,25);
		forUser.setLocation(20,150);
		forUser.setText("User");
		forUser.setToolTipText("搜索用户");
		
		frame.setContentPane(guiderpanel);
	
		guiderpanel.setLayout(null);
		guiderpanel.add(forRepository);
		guiderpanel.add(forUser);
		guiderpanel.add(input);
		guiderpanel.add(search);
		guiderpanel.setOpaque(false);
		guiderpanel.setBounds(0, 0, 130, 550);
		guiderpanel.repaint();
		
		frame.getContentPane().add(resultpanel);
		result.setText("Your search result");
		resultpanel.add(result);
//		resultpanel.setLayout(null);
	    resultpanel.setBounds(670,20,330,550);
		resultpanel.repaint();
		
		frame.getContentPane().add(typepanel);
		typepanel.setBounds(146,82,496,222);
		typepanel.repaint();
		
		frame.getContentPane().add(rankpanel);
		rankpanel.setBounds(146,314,496,212);
		rankpanel.repaint();
		
		forRepository.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
		});
		forUser.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				
			}
		});
		search.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				result.setText("没找到");
				resultpanel.add(result);
			}
		});
		
		frame.setVisible(true);	
	}

	public static workui creatframe(){
		frame = new workui();
		return frame;
	}
	
	public static workui getframe(){
		return frame;
	}
}
