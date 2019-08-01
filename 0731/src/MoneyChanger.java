
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MoneyChanger extends JFrame {
	
    int[] moneyc = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    String[] str = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
    JLabel la = new JLabel();
    JTextField[] tf = new JTextField[str.length];
    JButton btn = new JButton("계산");
    
    MoneyChanger() 
    {
        this.setTitle("Money Changer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.PINK);
        this.setLayout(null);
        
        la = new JLabel(str[0]);
        la.setSize(40, 20);
        la.setLocation(20, 20);
        this.add(la);
        
        tf[0] = new JTextField(30);
        tf[0].setSize(100, 20);
        tf[0].setLocation(100, 20);
        this.add(tf[0]);
        
        btn.setSize(70, 20);
        btn.setLocation(210, 20);
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String mon = tf[0].getText();
            if(mon.length() == 0) 
                return;
            
            int money = Integer.parseInt(mon);
            int m;
            
            for(int i=0; i<moneyc.length; i++) 
            {
                m = money/moneyc[i];
                tf[i + 1].setText(Integer.toString(m));
                if(m > 0) 
                    money = money % moneyc[i];
            }
            }
        });
        
        this.add(btn);
        for(int i = 1; i < str.length; i++)
        {
            la = new JLabel(str[i]);
            la.setHorizontalAlignment(JLabel.RIGHT);
            la.setSize(50, 20);
            la.setLocation(50, 50+(i*20));
            
            tf[i] = new JTextField(30);
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            tf[i].setSize(70, 20);
            tf[i].setLocation(120, 50+(i*20));
            this.add(la);
            this.add(tf[i]);
        }
        
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
    {
        new MoneyChanger();
    }
    }
}
