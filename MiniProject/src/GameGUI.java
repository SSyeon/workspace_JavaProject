import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class GameGUI extends JFrame {
	Container c = getContentPane();
	private PreparedStatement pstmt = null;
	private Connection conn = null;
	String[] ColorName = {"RED","ORANGE","YELLOW","GREEN","BLUE","PURPLE","PINK","BLACK"};
	Button[] btn = new Button[ColorName.length];
	Color [] color = {new Color(255,0,0),new Color(255,128,0),new Color(255,255,0),
			new Color(0,255,0),new Color(0,0,255),new Color(127,0,255),
			new Color(255,153,204),new Color(0,0,0)};
	public void makeButton() {
		for(int i=0;i<ColorName.length;i++) {
			btn[i]=new Button(ColorName[i]);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
	}
	GameGUI(){
		setTitle("ColorGame");
		setSize(650,650);
		setVisible(true);
		setLayout(new GridLayout(3,3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		makeButton();
	}
	

public static void main(String []ar) {
	new GameGUI();
}
}
