package yicheJsonTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rwg
 * @date 2021/10/28 15:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String status;
    private String message;
    private yicheJsonTest.Data data;
}
