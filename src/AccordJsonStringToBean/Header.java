package AccordJsonStringToBean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Header
{
    @JSONField(name = "DataFormat")
    private String dataFormat;

    @JSONField(name = "Version")
    private String version;
}
