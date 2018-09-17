/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
int zoom=-100000000;
JOptionPane.showMessageDialog(null, "I AM DAVE THE CODER, THE DRAGON KING, USER OF ULTIMTE MAGIC, POOR FARMER, MOST WANTED BY THE KING OF THE EMPIRE");
JOptionPane.showMessageDialog(null, "I HAVE A QUEST FOR YOU");
JOptionPane.showConfirmDialog(null, "DO YOU WANT MY POWERFUL MAGIC. ANSWER THESE THEN YOU SHALL GET IT");
 JOptionPane.showConfirmDialog(null, "DO YOU WANT TO CONTINUE THIS IT COULD BE YOUR DOOM?? ");
 JOptionPane.showMessageDialog(null, "YOU SHALL LOSE NO MATTER WHAT");
 JOptionPane.showConfirmDialog(null, "CAN YOU PROVE ME WRONG??");
JOptionPane.showMessageDialog(null, "DO NOT FORGET TO START THE NAME AND LAST NAME IN CAP LOCKS!!!");
		// 2. Set the size of the window in the initializeGui() method below

		for (int i = 0; i < 4; i++) {
			
			// 4. Ask the user who this person is and store their answer
			String firstImage= JOptionPane.showInputDialog("Who is this?");
			
			// 5. Check their answer. If they guessed correctly:
			// -- Tell them they are right and increase the score by 1
if (firstImage.equals("Arnold Schwarzenegger")) {
	JOptionPane.showMessageDialog(null, "You are Right");
	JOptionPane.showMessageDialog(null, zoom+=1);
} else {
JOptionPane.showMessageDialog(null, "You are Wrong " + " This is Arnold Schwarzenegger");
JOptionPane.showMessageDialog(null, zoom-=100000000);

}
showNextImage();
String secondImage= JOptionPane.showInputDialog("Who is this?");
if (secondImage.equals("Leonardo DiCaprio")) {
JOptionPane.showMessageDialog(null, "You are Right");
JOptionPane.showMessageDialog(null, zoom+=1);
} else {
JOptionPane.showMessageDialog(null, "You are Wrong " + " Leonardo DiCaprio");
JOptionPane.showMessageDialog(null, zoom-=100000000);
}
showNextImage();
String thirdImage= JOptionPane.showInputDialog("Who is this?");
if (secondImage.equals("Morgan Freeman")) {
JOptionPane.showMessageDialog(null, "You are Right");
JOptionPane.showMessageDialog(null, zoom+=1);
} else {
JOptionPane.showMessageDialog(null, "You are Wrong " + " Morgan Freeman");
JOptionPane.showMessageDialog(null, zoom-=100000000);
}
showNextImage();
String fourthImage= JOptionPane.showInputDialog("Who is this?");
if (secondImage.equals("Jack Stack")) {
JOptionPane.showMessageDialog(null, "You are Right");
JOptionPane.showMessageDialog(null, zoom+=1);
} else {
JOptionPane.showMessageDialog(null, "You are Wrong " + " Jack Stack");
JOptionPane.showMessageDialog(null, zoom-=100000000);
}
JOptionPane.showMessageDialog(null,  "I told you");
JOptionPane.showMessageDialog(null,  "Game Over");



		// 6. Otherwise:
			// -- Tell them they are wrong and who the person is

			// 7. Use the showNextImage() method below to get the next image
}
			
		    // 8. Show them their current score
			
			// 9. .... repeat for all your images.....


		}

	

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the image.		
		window.setSize(500,500);
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
