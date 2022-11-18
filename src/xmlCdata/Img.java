package xmlCdata;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Img {

    @XmlElement(name="url")
    private String url;

    @XmlElement(name="size")
    private String size;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSize(String size) {
        this.size = size;
    }


}