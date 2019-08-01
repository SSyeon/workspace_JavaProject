import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MoneyChange extends JFrame{
	Container contentPane;
	JLabel la = new JLabel();
	JTextField tf = new JTextField();
	JButton btn = new JButton();
	String [] string = {"금액","오만원","만원","천원","500원","100원","50원","10원","1원"};
	JTextField[] tfL = new JTextField[string.length];
	MoneyChange() {
		contentPane = getContentPane();
		la = new JLabel("금액");
        la.setSize(40, 20);
        la.setLocation(20, 20);
        add(la);
        
        for(int i=1;i<string.length;i++) {
        	la=new JLabel(string[i]);
        	la.setSize(40, 20);
        	la.setLocation(50, 50+(i*20));
        	
        	tfL[i] = new JTextField(30);
        	tfL[i].setSize(70, 20);
        	tfL[i].setLocation(120, 50+(i*20));
        	
        	add(la);
        	add(tfL[i]);
        }
        
        tf = new JTextField(30);
        tf.setSize(100, 20);
        tf.setLocation(100, 20);
        add(tf);
        
        btn = new JButton(" 계산  ");
        btn.setSize(70, 20);
        btn.setLocation(210, 20);
        btn.addActionListener(new ActionListener(){
        	@Override
            public void actionPerformed(ActionEvent e) {
        		String money = tf.getText();
        		if(money.length() == 0) 
                    return;
        		int Realmoney = Integer.parseInt(money);
        	}
        });
        add(btn);
       
		setTitle("Money Change");
		getContentPane().setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		setSize(300, 300);
		setVisible(true);
    }
	public static void main(String[] args) {
		new MoneyChange();
	}

}
