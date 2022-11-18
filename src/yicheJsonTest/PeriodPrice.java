package yicheJsonTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author rwg
 * @date 2021/10/28 15:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodPrice {
    private String stationNo;
    private String startTime;
    private String endTime;
    private BigDecimal servicePrice;
    private BigDecimal electricityPrice;
    private Integer price;
}
