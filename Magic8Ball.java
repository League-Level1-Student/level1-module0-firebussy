package fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	//magic 8 ball
	Random num= new Random();
	//1. Ask the user to ask a question
	JOptionPane.showInputDialog("Ask a Yes or No Question");
	//2. Generate a random integer between 0-3
	 int number=num.nextInt(3);
	//3. Give them a response based on the random number
	if (number==0){
		JOptionPane.showMessageDialog(null, "NO");
	}
	if (number==1){
		JOptionPane.showMessageDialog(null, "Yes");
	}
	if (number==2){
		JOptionPane.showMessageDialog(null, "Maybe");
	}
	}


	
	/* 
	 * if(rNum == 0){
		JOptionPane.showMessageDialog(null, "NO");
		}
		*/
	
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer


