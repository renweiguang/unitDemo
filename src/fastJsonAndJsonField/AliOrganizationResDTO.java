package fastJsonAndJsonField;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AliOrganizationResDTO
{
    // 组织机构显示名称
    private String organizationName;

    // 外部唯一标识
    private String externalId;

    // 父级外部唯一标识
    private String parentExternalId;

    // 组织类型
    private String type;

    // 是否为根组织
    private boolean rootNode;

    // 组织排序号
    private Integer sortNumber;

    // 是否启用
    private boolean enabled;

    // 组织描述
    private String description;

    // 扩展属性
    private JSON extendFields;

    // 唯一标识
    private String uuid;

    // 父级唯一标识
    private String parentUuid;
}
