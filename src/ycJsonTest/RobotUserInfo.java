package ycJsonTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author rwg
 * @date 2021/11/3 18:43
 */

@Data
@Builder
@AllArgsConstructor
public class RobotUserInfo {

    private String userName;

    private Integer userFrom ;

    private Integer userType;

    private String locationName;

    private Integer cityId;
}
