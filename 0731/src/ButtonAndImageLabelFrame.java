import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ButtonAndImageLabelFrame extends JFrame{
	Container contentPane;
	ButtonAndImageLabelFrame(){
		setTitle("JColorChooser ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	void createMenu() {

		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem1 = new JMenuItem("ȭ�� Ȯ��");
		JMenuItem colorMenuItem2 = new JMenuItem("�� ����");
		JMenu fileMenu1 = new JMenu("����");
		JMenu fileMenu2 = new JMenu("����");
		JMenu fileMenu3 = new JMenu("����");
		JMenu fileMenu4 = new JMenu("�Է�");
		colorMenuItem1.addActionListener(new ActionListener());
		fileMenu3.add(colorMenuItem1);
		mb.add(fileMenu1);
		mb.add(fileMenu2);
		mb.add(fileMenu3);
		mb.add(fileMenu4);
		this.setJMenuBar(mb);
	}

	public static void main(String[] args) {
			new ButtonAndImageLabelFrame();
	}

}
