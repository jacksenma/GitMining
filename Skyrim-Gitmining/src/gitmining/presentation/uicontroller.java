package gitmining.presentation;

import javax.swing.JFrame;


public class uicontroller {
	
public static JFrame ui;


public static void startmainui(){
	 ui =mainui.creatframe();
	 mainui.init();
}

public static void startworkui(){
	 ui =workui.creatframe();
	 workui.init();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ui =mainui.creatframe();
		 mainui.init();
	}

}
