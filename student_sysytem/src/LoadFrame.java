import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LoadFrame {

	static void Load() {
		  
		  try {
		   DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		   DocumentBuilder db;
		   try {
		    db = dbf.newDocumentBuilder();
		 
		   Document document=db.parse("src\\contect.xml");
		   NodeList content=document.getElementsByTagName("person");
		   System.out.println(content.getLength());
		   
		   for(int i=0;i<content.getLength();i++) {
			   person p=new person();
		    Node person=content.item(i);
		    NodeList attrs=person.getChildNodes();
		    p.setName(attrs.item(1).getTextContent());
		    p.setID(attrs.item(3).getTextContent());
		    p.setBuilding(attrs.item(5).getTextContent());
		    p.setRoom(attrs.item(7).getTextContent());
		    menufunction.contect.add(p);
		  
		    
		 }} catch (ParserConfigurationException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
	     }} catch (SAXException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		 } catch (IOException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		 }
		  HaveDone.createFINISH();
		  
		 }



}

