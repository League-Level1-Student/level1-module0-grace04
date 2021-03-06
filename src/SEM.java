import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SEM implements MouseListener {
	
	public static void main(String[] args) {
		SEM machine = new SEM();
		machine.showButton();
	}
	
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		
	private void showButton() {
	    JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		button1.addMouseListener(this);
		panel.add(button2);
		button2.addMouseListener(this);
		frame.pack();
	}

	public void mouseClicked(MouseEvent e) {
	    System.out.println("Button clicked");
		// TODO Auto-generated method stub
		JButton mouseClicked = (JButton) e.getSource();
		if (mouseClicked.equals(button1)) {
			playSound("drum.wav");
		}
		else if (mouseClicked.equals(button2)) {
			playSound("cymbal.wav");
		}
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
