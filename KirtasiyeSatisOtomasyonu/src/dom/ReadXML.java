/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dom;

import guidemo.FXMLtablewiewController;
import guidemo.Person;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author LENOVO
 */
public class ReadXML {
     public List mylist=new ArrayList();
     public FXMLtablewiewController element;
    public List okuXML() throws Exception{
        
         File xmlFile=new File("C:\\XML\\data.xml");
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
        Document document=documentBuilder.parse(xmlFile);
        try {
            document = documentBuilder.parse(xmlFile);
        } catch (IOException ex) {
            Logger.getLogger(ReadXML.class.getName()).log(Level.SEVERE, null, ex);
        }
            NodeList list=document.getElementsByTagName("kirtasiye");
            for(int i=0;i<list.getLength();i++){
                
                Node node=list.item(i);
                
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    
                    Element element=(Element) node;
                    mylist.add(element.getElementsByTagName("barkod").item(0).getTextContent()+"\n");
                    mylist.add(element.getElementsByTagName("urun").item(0).getTextContent()+"\n");
                    mylist.add(element.getElementsByTagName("tarih").item(0).getTextContent()+"\n");
            
                    
          // System.out.println(element.getElementsByTagName("barkod").item(0).getTextContent());
          //System.out.println(element.getElementsByTagName("urun").item(0).getTextContent());
          //System.out.println(element.getElementsByTagName("tarih").item(0).getTextContent());
   
        
    }
    }
         return mylist;
    }}
