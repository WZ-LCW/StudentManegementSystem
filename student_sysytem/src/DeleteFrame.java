import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeleteFrame {
	static void doDelete() {		
		JFrame DELETEframe =new JFrame("Delete");


		Container contentPane = DELETEframe.getContentPane();
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JLabel("deleteNum"));
		contentPane.add(new TextField());
		

    	DELETEframe.setSize(800, 600);
		DELETEframe.setVisible(true);
		
		TextField deleteNum = new TextField();
		
		
		JButton deletebutton= new JButton("delete!!");
        contentPane.add(deletebutton);
        
        deletebutton.addActionListener(new ActionListener() {
        
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String key=deleteNum.getText().toString();
				 JFrame RESULTframe =new JFrame("Result");
           for(person p:menufunction.contect) {
        	   if(p.getID().equalsIgnoreCase(key)) {
        		  
        		    int num=menufunction.contect.indexOf(p);
                    
        			menufunction.contect.remove(num);
        			
        	   }
        	   
   			}
			   RESULTframe.setSize(400, 600);
				RESULTframe.setVisible(true);
        


	
	
	}});
        
	}}

