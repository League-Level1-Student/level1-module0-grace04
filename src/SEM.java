import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SEM implements ActionListener {
	
	public static void main(String[] args) {
		SEM machine = new SEM();
	}
	
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		
	public void showButton() {
	    System.out.println("Button clicked");
	    JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		button1.addActionListener(this);
		panel.add(button2);
		button2.addActionListener(this);
		frame.pack();
	}

	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton click = new JButton();
		if (click.equals(button1)) {
			playSound("drum.wav");
		}
		else if (click.equals(button2)) {
			playSound("cymbal.wav");
		}
		
	}
	
}
