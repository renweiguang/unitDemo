package fastJsonAndJsonField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName XyyDto
 * @Description TODO
 * @Author renwg
 * @Date 2023/7/11 16:48
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class XyyDto implements Serializable {

    private String bankShortName;

    private String bankLogo;
}