package AccordJsonStringToBean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AxisCallParam
{
    @JSONField(name = "CmdOpt")
    private CmdOpt cmdOpt;
}
