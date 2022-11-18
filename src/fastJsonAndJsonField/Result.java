package fastJsonAndJsonField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rwg
 * @date 2021/8/27 15:58
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private Integer trimId;

    private Integer checkStatus;

    private Integer topicId;
}
