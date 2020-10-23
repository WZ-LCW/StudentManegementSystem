
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class menufunction {
	public static ArrayList<person> contect = new ArrayList<person>();
	public static NodeList people;
	public Node contectlist;
	
     public static void addnewone(person p) {
    
 
     		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
     
     	        DocumentBuilder db;
     		try {  
     			db = dbf.newDocumentBuilder();
     		
     		        File f=new File("src\\contect.xml");
     		        Document doc = db.parse(f);  
     		        Element person = doc.createElement("person"); 
     		    	
     		        
     		        Element _name = doc.createElement("name"); 
     				person.appendChild(_name);  
     				_name.setTextContent(p.getName());
     				
     				Element _ID = doc.createElement("ID"); 
     				person.appendChild(_ID);  
     				_ID.setTextContent(p.getID());
     				
     				Element _building = doc.createElement("building"); 
     				person.appendChild(_building);  
     				_building.setTextContent(p.getBuilding());
     				
     				Element _room = doc.createElement("room"); 
     				person.appendChild(_room);  
     				_room.setTextContent(p.getRoom());
     				doc.getDocumentElement().appendChild(person);
      		        
    				
    		    
    		        TransformerFactory transformerFactory=TransformerFactory.newInstance();  
    		        Transformer transformer=transformerFactory.newTransformer();  
    		        DOMSource domSource=new DOMSource(doc);  
    		          
    		    
    		        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");  
    		        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
    		        StreamResult result=new StreamResult(new FileOutputStream(f));  
    		          
    		        transformer.transform(domSource, result); 
    		} catch (Exception e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}  
    	       
    		}

    		
    		
   
     public void finish() {
    	 System.out.println("finish! ");
			System.exit(0);
     }
}