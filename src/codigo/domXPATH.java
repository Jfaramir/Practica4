/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;


/**
 *
 * @author xp
 */
public class domXPATH {
    Document doc;
    
    public int AbrirXpath(){
        
       
    }
    
    
    
    
    public int EjecutaXpath(){
        String salida = "";
        try {
             
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            Document XMLDoc = factory.newDocumentBuilder().parse(new File("LibrosXML.xml"));
            
            XPath xpath = XPathFactory.newInstance().newXPath();
            
            XPathExpression exp = xpath.compile("Libros/*/Autor");
            
            Object result = exp.evaluate(XMLDoc, XPathConstants.NODESET);
            NodeList nodeList = (NodeList) result;
            
            for(int i=0; i < nodeList.getLength(); i++){
                salida = salida + "\n" + nodeList.item(i).getChildNodes().item(0).getNodeValue();
                
            }
            System.out.println(salida);
            return 0;
            
        } catch (Exception e) {
            return -1;
        }
         
    }    
     
}
