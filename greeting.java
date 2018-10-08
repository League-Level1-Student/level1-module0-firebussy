package algorithms;


import javax.swing.*;

public class greeting {
	 JFrame water= new JFrame();
	 JPanel earth= new JPanel();
	 JButton fire= new JButton("Convert");	 
	 JTextField air= new JTextField(20);
	 JLabel light= new JLabel("Degrees Farenheint");
	 JLabel dark = new JLabel();
	greeting(){
		water.setVisible(true);
		water.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		water.add(earth);
		earth.add(fire);
		earth.add(air);
		earth.add(light);
		earth.add(dark);
		water.pack();
	}
public static void main(String[] args) {
	greeting hello = new greeting();
}
}
