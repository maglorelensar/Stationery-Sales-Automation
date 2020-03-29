/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dom;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class CrudDOM {
       public CrudDOM(){
             
         }
    public void Ekle(String brkd,String urunadi,String tarihh){
         
        try {
            
            
            Document document=DOMHelper.getDocument("C:\\XML\\data.xml");
            
            Element data=document.getDocumentElement();
            Element element=document.createElement("kirtasiye");
           
           
            Element barkod=document.createElement("barkod");
            barkod.appendChild(document.createTextNode(brkd));
            element.appendChild(barkod);
            
            
            Element urun=document.createElement("urun");
            urun.appendChild(document.createTextNode(urunadi));
             element.appendChild(urun);
             
            Element stok=document.createElement("tarih");
            stok.appendChild(document.createTextNode(tarihh));
            element.appendChild(stok);


            data.appendChild(element);

           
            DOMHelper.saveXMLContent(document, "C:\\XML\\data.xml");

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void Sil(String brkd){
        try {
            Document d=DOMHelper.getDocument("C:\\XML\\data.xml");
            NodeList nl=d.getElementsByTagName("kirtasiye");
            for(int i=0;i<nl.getLength();i++){
                Element eelement=(Element) nl.item(i);
                if(eelement.getElementsByTagName("barkod").item(0).getTextContent().equals(brkd)){
                    eelement.getParentNode().removeChild(eelement);
                }}
            DOMHelper.saveXMLContent(d, "C:\\XML\\data.xml");
         
        } catch (Exception e) {
        }
    }
    public void Güncelle(String brkd,String urn,String trh){
          Document d=DOMHelper.getDocument("C:\\XML\\data.xml");
            NodeList nl=d.getElementsByTagName("kirtasiye");
            for(int i=0;i<nl.getLength();i++){
                Element eelement=(Element) nl.item(i);
                if(eelement.getElementsByTagName("barkod").item(0).getTextContent().equals(brkd)){
               
                    eelement.getElementsByTagName("urun").item(0).setTextContent(urn);
                    eelement.getElementsByTagName("tarih").item(0).setTextContent(trh);
                    
                     }}
                      DOMHelper.saveXMLContent(d, "C:\\XML\\data.xml");
                }
    public void Oku() throws SAXException, IOException, ParserConfigurationException {
        //Get Document Builder
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
 
//Build Document
Document document = builder.parse(new File("employees.xml"));
 
//Normalize the XML Structure; It's just too important !!
document.getDocumentElement().normalize();
 
//Here comes the root node
Element root = document.getDocumentElement();
System.out.println(root.getNodeName());
 
//Get all employees
NodeList nList = document.getElementsByTagName("employee");
System.out.println("============================");
 
for (int temp = 0; temp < nList.getLength(); temp++)
{
 Node node = nList.item(temp);
 System.out.println("");    //Just a separator
 if (node.getNodeType() == Node.ELEMENT_NODE)
 {
    //Print each employee's detail
    Element eElement = (Element) node;
    System.out.println("Employee id : "    + eElement.getAttribute("id"));
    System.out.println("First Name : "  + eElement.getElementsByTagName("barkod").item(0).getTextContent());
    System.out.println("Last Name : "   + eElement.getElementsByTagName("urun").item(0).getTextContent());
    System.out.println("Location : "    + eElement.getElementsByTagName("tarih").item(0).getTextContent());
 }
}
    }

    }
           
    

