import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowFrame {
	static void createSHOW() {		
		JFrame SHOWframe =new JFrame("View all contact");


		Container contentPane = SHOWframe.getContentPane();
		contentPane.setLayout(new FlowLayout());
	
		
for(person p:menufunction.contect) {
	if(!p.ID.isEmpty()) {
	contentPane.add(new JLabel("name"+p.getName()));
	contentPane.add(new JLabel("ID"+p.getID()));
	contentPane.add(new JLabel("building"+p.getBuilding()));
	contentPane.add(new JLabel("room"+p.getRoom()));
}}

		SHOWframe.setSize(800, 600);
		SHOWframe.setVisible(true);
	}
}