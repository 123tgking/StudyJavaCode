package abstractFactory.Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {
    public static Object getBean(){

        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse("C:\\Users\\sa\\myJavaCode\\helloworld\\src\\abstractFactory\\config.xml");

            NodeList list = document.getElementsByTagName("className");
            Node node = list.item(0).getFirstChild();
            String name = node.getNodeValue();

            Class clazz = Class.forName("abstractFactory.Imp.FactoryImp."+name);//abstractFactory.Imp.FactoryImp.SpringFactory

            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
