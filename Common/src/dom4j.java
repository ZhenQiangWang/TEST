import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

public class dom4j {
    public static void main(String[] args) throws MalformedURLException, DocumentException {
        File file = new File("Common/src/MYCIMCONFIG.xml");
        SAXReader sax = new SAXReader();
        Document document = sax.read(file);
        Element rootElement = document.getRootElement();//获取根节点
        System.out.println(rootElement.getName());
        List<Element> elements = rootElement.elements();//获取所有子元素
        List<Element> mergeConfig = rootElement.elements("MERGECONFIG");//获取特定名称子元素
        for(Iterator it = mergeConfig.iterator(); it.hasNext();){
            Element element = (Element) it.next();
            List timelimits = element.elements("TIMELIMITS");
            System.out.println(timelimits);
        }
    }
}
