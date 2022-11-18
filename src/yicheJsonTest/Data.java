package yicheJsonTest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author rwg
 * @date 2021/10/28 15:21
 */
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private String stationNo;
    private String stationName;
    private String connectorNo;
    private String connectorId;
    private List<PeriodPrice> periodPrice;
    private PeriodPrice currentPeriodPrice;
    private ParkingStationVO parkingStationVO;
    private String tips;
    private Integer id;
    private String carNum;
}
