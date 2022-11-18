package fastJsonAndJsonField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AliUserListResDTO {
    // 账户外部唯一标识
    private String externalId;

    // 账户名称
    private String username;

    // 账户显示名称
    private String displayName;

    // 手机号区号
    private String phoneNumber;

    // 手机号区号
    private String phoneRegion;

    // 邮箱
    private String email;

    // 账户是否锁定
    private boolean locked;

    // 账户是否启用
    private boolean enabled;

    // 描述
    private String description;

    //    // 扩展属性
//    private JSONObject extendFields;
    private ExtendFieldsDto extendFields;

    // 组织机构信息
    private String belongs;
}

