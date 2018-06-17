

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class counter {

	public static void main(String[] args) {
		new counter().createUI();
	}

	JButton Button = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
		private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		Button.setText("Click me!");

		// 5. Add an action listener to the leftButton
		Button.addActionListener(this);

		// 7. Add the leftButton to the panel
		panel.add(Button);

		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Click Counter");
	}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton buttonPressed = (JButton) arg0.getSource();
			
			int num = 0;
			/* If the buttonPressed was the leftButton....*/
				// Set the text of the rightButton to "No, click Me!"
				// Set the PREFERRED size of the rightButton to BIG
				// Set the text of the leftButton to "Click Me!"
				// Set the PREFERRED size of the leftButton to SMALL
			if (buttonPressed.equals(Button)) {
				num++;
			}

			}

			frame.pack();
		}
	
}
