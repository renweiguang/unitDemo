package yicheJsonTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rwg
 * @date 2021/10/28 15:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingStationVO {
    private Integer status;
    private String context;
    private Integer waiverType;
    private String note;
    private Integer duration;
    private boolean isSuccess;
}
