import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.bind.Unmarshaller.Listener;

public class AddFrame {
	static void createADD() {		
	JFrame ADDframe =new JFrame("New Contact");


	Container contentPane = ADDframe.getContentPane();
	contentPane.setLayout(new FlowLayout());

	contentPane.add(new JLabel("name"));
	TextField Tname=new TextField();
	contentPane.add(Tname);
	
	
	contentPane.add(new JLabel("ID"));
	TextField TID=new TextField();
	contentPane.add(TID);
	
	contentPane.add(new JLabel("building"));
	TextField Tbuilding=new TextField();
	contentPane.add(Tbuilding);
	
	contentPane.add(new JLabel("room"));
	TextField Troom=new TextField();
	contentPane.add(Troom);
	
	
	JButton createbutton=new JButton("create!!");
	contentPane.add(createbutton);
	
	createbutton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			person p =new person();
		    p.setName(Tname.getText());
		    p.setID(TID.getText());
		    p.setBuilding(Tbuilding.getText());
		    p.setRoom(Troom.getText());
		    menufunction.contect.add(p);
			HaveDone.createFINISH();
			}});


	ADDframe.setSize(800, 600);
	ADDframe.setVisible(true);
	}}
