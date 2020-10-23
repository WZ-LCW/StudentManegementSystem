import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingDemo {
	/**
	 * 
	 */
	
	
	private static void creatGUI() {	
		
	menufunction menu=new menufunction();
JFrame frame =new JFrame("Menu");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Container contentPane = frame.getContentPane();
contentPane.setLayout(new FlowLayout());

JButton IR1= new JButton("1.View all contacts");
contentPane.add(IR1);
JButton IR2 = new JButton("2.Search");
contentPane.add(IR2);
JButton IR3 = new JButton("3.New Contact");
contentPane.add(IR3);
JButton IR4= new JButton("4.Load");
contentPane.add(IR4);
JButton IR5= new JButton("5.Store");
contentPane.add(IR5);
JButton IR6= new JButton("6.Delete");
contentPane.add(IR6);
JButton IR7 = new JButton("7.Exit");
contentPane.add(IR7);
 

IR1.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
		ShowFrame.createSHOW();
		
	}
});

IR2.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	SearchFrame.createSEARCH();
	}
});
IR3.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		AddFrame.createADD();
		
	}
});

IR4.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
     LoadFrame.Load();
	}
});
IR5.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StoreFrame.store();
	}
});

IR6.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
      DeleteFrame.doDelete();
	}
});

IR7.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
      menu.finish();
	}
});
frame.setSize(400, 300);
frame.setVisible(true);

	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				creatGUI();
			}
		});
	}

}
