package xmlCdata;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.sax.SAXResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JuintXmlTest
{
    private static Marshaller marshal;

    @Test
    public void testXml() throws Exception {
        List<String> list = new ArrayList<String>();
        list.add("11_11_11");
        list.add("22_22_22");
        list.add("33_33_33");
        List<Img> imgList = new ArrayList<Img>();
        Img img = null;
        for (int i = 0; i < 2; i++) {
            img = new Img();
            img.setUrl("-" + i + "-");
            img.setSize("40×40");
            imgList.add(img);
        }

        FanLiProductInofMsg fps = new FanLiProductInofMsg();
        fps.setVersion("1.0");
        fps.setId("110");
        fps.setTitle("4K 高清");
        fps.setCategory("电视>4K>高清");
        fps.setUrl("http://baidu.com");
        fps.setUrlWap("http://baidu.wap.com");
        fps.setPrice("100");
        fps.setPromotionPrice("111");
        fps.setWapPrice("113");
        fps.setSubItemIds(list);
        fps.setDetail("wwwwwwwwwwwwwwwwwwwwwww");
        fps.setStatus("1");
        fps.setMainImg(imgList);
        fps.setExtraImg(imgList);

        PrintWriter pw = new PrintWriter(new File("D:/test.xml"));
        String ojbectToXmlWithCDATA = ojbectToXmlWithCDATA(FanLiProductInofMsg.class, fps);
        System.out.println(ojbectToXmlWithCDATA);
        pw.println(ojbectToXmlWithCDATA);
        pw.close();



    }
    public static String ojbectToXmlWithCDATA(Class clazz, Object obj) throws Exception {

        JAXBContext context = JAXBContext.newInstance(clazz);
        // configure an OutputFormat to handle CDATA
        OutputFormat of = new OutputFormat();
        of.setCDataElements(
                new String[] { "^title", //
                        "^category",
                        "^url",
                        "^url_wap",
                        "^detail"
                }); //

        // set any other options you'd like
        of.setPreserveSpace(true);
        of.setIndenting(true);
        // create the serializer
        ByteArrayOutputStream op = new ByteArrayOutputStream();
        XMLSerializer serializer = new XMLSerializer(op, of);
        SAXResult result = new SAXResult(serializer.asContentHandler());
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        mar.marshal(obj, result);

        return op.toString("utf-8");
    }

}
