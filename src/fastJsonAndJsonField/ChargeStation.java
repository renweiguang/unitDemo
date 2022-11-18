package fastJsonAndJsonField;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rwg
 * @date 2021/9/28 14:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargeStation {
    @JSONField(name = "STATION_ID")
    private String stationId;

    @JSONField(name = "STATION_NO")
    private String stationNo;
}
