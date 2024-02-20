package ziDingYiTryCatch;

import dateutils.DateUtil;
import lombok.Data;

/**
 * @ClassName ProductDto
 * @Description TODO
 * @Author renwg
 * @Date 2023/8/16 09:59
 * @Version 1.0
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.StringUtil;


/**
 * 商品基本返回参数
 *
 * @author danshiyu
 */
@Data
public class ProductDto implements Serializable, Cloneable {
    private static final long serialVersionUID = 3158531339775407620L;
    private Double fob;

    private String spec;

    private String showName;

    public Double getFob() {
        return fob;
    }

    public void setFob(Double fob) {
        this.fob = fob;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

}