import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
	public void showButton() {
	    System.out.println("Button clicked");
	    JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		int rand = new Random().nextInt(5);
		frame.pack();
	}
	
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
	
}
