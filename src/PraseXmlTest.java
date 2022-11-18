import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.xml.sax.InputSource;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PraseXmlTest {

    public static void main(String[] args) {
        String xml = "<xml><code><![CDATA[484848498489]]></code><msg><![CDATA[msg]]></msg><responseId>12345678</responseId></xml>";
        System.out.println(parseXmlToList2(xml)[0]);
    }

    @SuppressWarnings("unchecked")
    private static Object[] parseXmlToList2(String xml) {
        List<Map> argMapList = new ArrayList<Map>();
        Map retMap = new HashMap();
        try {
            StringReader read = new StringReader(xml);
            // 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
            InputSource source = new InputSource(read);
            // 创建一个新的SAXBuilder
            SAXBuilder sb = new SAXBuilder();
            // 通过输入源构造一个Document
            Document doc = (Document) sb.build(source);
            Element root = doc.getRootElement();// 指向根节点
            List<Element> es = root.getChildren();
            if (es != null && es.size() != 0) {
                for (Element element : es) {
                    retMap.put(element.getName(), element.getText());
                }
            }
            argMapList.add(retMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Object[]{argMapList};
    }
}