import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HaveDone {
	static void createFINISH() {		
		JFrame FINISHframe =new JFrame("have done!");
	

		Container contentPane = FINISHframe.getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("have done the operation!!"));
		
	

		FINISHframe.setSize(900, 600);
		FINISHframe.setVisible(true);
		}}

