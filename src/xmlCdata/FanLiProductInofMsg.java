package xmlCdata;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="item")
public class FanLiProductInofMsg
{
    @XmlAttribute
    private String version;

    @XmlElement
    private String id;

    @XmlElement
    private String title;

    @XmlElement
    private String category;

    @XmlElement
    private String url;//Pc商品的url

    @XmlElement(name="url_wap")
    private String urlWap;//Wap商品的url  url_wap

    @XmlElement
    private String price;

    @XmlElement(name="promotion_price")
    private String promotionPrice;//promotion_price

    @XmlElement(name="wap_price")
    private String wapPrice;//wap_price

    @XmlElementWrapper(name="sub_item_ids")
    @XmlElement(name="sub_item_id")
    private List<String> subItemIds;//sub_item_ids

    @XmlElement
    private String detail;//detail

    @XmlElement
    private String status;//status


    @XmlElementWrapper(name="pic_main")
    @XmlElement(name="img")
    private List<Img> mainImg;//pic_main

    @XmlElementWrapper(name="pic_extra")
    @XmlElement(name="img")
    private List<Img> extraImg;//pic_extra


    public void setVersion(String version) {
        this.version = version;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUrlWap(String urlWap) {
        this.urlWap = urlWap;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public void setWapPrice(String wapPrice) {
        this.wapPrice = wapPrice;
    }

    public void setSubItemIds(List<String> subItemIds) {
        this.subItemIds = subItemIds;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMainImg(List<Img> mainImg) {
        this.mainImg = mainImg;
    }

    public void setExtraImg(List<Img> extraImg) {
        this.extraImg = extraImg;
    }
}
