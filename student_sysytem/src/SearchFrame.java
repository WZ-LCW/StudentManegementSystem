import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SearchFrame {
	static void createSEARCH() {		
		JFrame SEARCHframe =new JFrame("Search");


		Container contentPane = SEARCHframe.getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("keyword"));
		contentPane.add(new TextField());
		
		JTextField keyword = new JTextField();
		
		
		JButton searchbutton= new JButton("search!!");
        contentPane.add(searchbutton);
        searchbutton.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String key=keyword.getText().toString();	
				 JFrame RESULTframe =new JFrame("Result");
				 RESULTframe.setSize(400, 600);
		   			RESULTframe.setVisible(true);
           for(person p:menufunction.contect) {
        	   if(p.getName().contains(key)||p.getID().contains(key)||p.getBuilding().contains(key)||p.getRoom().contains(key)) {
        		  
        		

        			Container contentPane = RESULTframe.getContentPane();
        			contentPane.setLayout(new FlowLayout());
        			
        			contentPane.add(new JLabel("name"+p.getName()));
        			contentPane.add(new JLabel("ID"+p.getID()));
        			contentPane.add(new JLabel("building"+p.getBuilding()));
        			contentPane.add(new JLabel("room"+p.getRoom()));
        			   
        			
        	   }
        	
   			}
           }});
        

        

		SEARCHframe.setSize(800, 600);
		SEARCHframe.setVisible(true);
		}
}
