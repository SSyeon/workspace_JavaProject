import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DialogEx2 extends JFrame{
	MyModalDialog dialog = new MyModalDialog(this,"Test Modal Dialog");
	
	public DialogEx2() {
		super("DialogEex2 예제 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				//모달 다이얼로그 이므로 setVisible() 메소드는
				//다이얼로그가 닫힐 때까지 리턴하지 않는다.
				String text = dialog.getInput();
				if(text == null) return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static  void main(String ar[]) {
		new DialogEx2();
	}
}

