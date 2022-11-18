package AccordJsonStringToBean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmdOpt
{
    @JSONField(name = "Header")
    private Header header;

    @JSONField(name = "CmdParam")
    private List<CmdParam> cmdParam;


}
