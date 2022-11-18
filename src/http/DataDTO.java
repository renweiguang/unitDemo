package http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author renwg
 * @date 2022/2/17
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataDTO {
    private Integer carId;
    private String carName;
    private String serialName;
    private String referPrice;
    private String year;
    private Integer saleStatus;
    private boolean electricCar;
}
