
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String firimageUrl = "https://cloud.netlifyusercontent.com/assets/344dbf88-fdf9-42bb-adb4-46f01eedd629/68dd54ca-60cf-4ef7-898b-26d7cbe48ec7/10-dithering-opt.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component firImage = createImage(firimageUrl);
		// 3. use the "createImage()" method below to initialize your Component
		int score = 0;
		// 4. add the image to the quiz window
		quizWindow.add(firImage);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String firAns = JOptionPane.showInputDialog("What animal is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (firAns.equalsIgnoreCase("owl")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(firImage);
		// 10. find another image and create it (might take more than one line of code)
		String secimageUrl = "https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg?resize=640%2C426";
		Component secImage = createImage(secimageUrl);
		// 11. add the second image to the quiz window
		quizWindow.add(secImage);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String secAns = JOptionPane.showInputDialog("What animal is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (secAns.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		JOptionPane.showMessageDialog(null, "score: " + score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
