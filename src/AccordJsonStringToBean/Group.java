package AccordJsonStringToBean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group
{
    @JSONField(name = "Type")
    private String type;

    @JSONField(name = "Item")
    private List<Item> items;
}
