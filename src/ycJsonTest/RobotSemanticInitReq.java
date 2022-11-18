package ycJsonTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author rwg
 * @date 2021/11/3 18:43
 */
@Builder
@Data
@AllArgsConstructor
public class RobotSemanticInitReq {
    private RobotUserInfo userInfo;
}
