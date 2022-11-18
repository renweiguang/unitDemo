package ycJsonTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rwg
 * @date 2021/11/3 18:45
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppParam<T> {

    private T param;
}
