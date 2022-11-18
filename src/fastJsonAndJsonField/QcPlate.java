package fastJsonAndJsonField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QcPlate
{
    private String plateNumber;


    private String holeNumber;

    private String qcType;

    private String value;
}
