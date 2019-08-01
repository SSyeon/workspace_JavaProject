import java.awt.Container;
import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class AudioStart extends JFrame {
	Clip clip = null;
	AudioInputStream audioStream = null;
	JLabel msgLabel = new JLabel("오디오 파일");
	JButton sbtn = new JButton("연주");
	JButton ebtn = new JButton("종료");
	

	public AudioStart() {
		super("오디오 파일을 연주/종료 제어");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		msgLabel.setFont(new Font("Gothic", Font.PLAIN, 15));
		msgLabel.setHorizontalAlignment(JLabel.LEFT);
		open.setHorizontalAlignment(JButton.CENTER);
		sbtn.setHorizontalAlignment(JButton.CENTER);
		ebtn.setHorizontalAlignment(JButton.RIGHT);

		c.add(msgLabel);
		c.add(sbtn);
		c.add(ebtn);
		
		setSize(450, 150);
		setVisible(true);

		sbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (clip != null && clip.isActive())
					clip.close();

				playAudio("src/hiphop.wav");
				msgLabel.setText("hiphop.wav" + " 를 연주하고 있습니다.");
			}
		});
		ebtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (clip != null && clip.isActive()) {
					clip.close();
					msgLabel.setText("연주를 종료합니다");
				}
				try {
					audioStream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	private void playAudio(String pathName) {
		try {
			File audioFile = new File(pathName);
			audioStream = AudioSystem.getAudioInputStream(audioFile);

			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AudioStart();
	}

}
