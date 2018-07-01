import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CTV implements MouseListener {
	
	public static void main(String[] args) {
	CTV ctv = new CTV();
	ctv.showButton();
	}
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
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
		panel.add(button3);
		button3.addMouseListener(this);
		frame.pack();
	}
	
	public void mouseClicked(MouseEvent e) {
	    System.out.println("Button clicked");
		// TODO Auto-generated method stub
		JButton mouseClicked = (JButton) e.getSource();
		if (mouseClicked.equals(button1)) {
			showDucks();
		}
		else if (mouseClicked.equals(button2)) {
			showFrog();
		}
		else if (mouseClicked.equals(button3)) {
			showFluffyUnicorns();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
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
