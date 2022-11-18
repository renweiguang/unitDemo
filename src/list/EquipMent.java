package list;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rwg
 * @date 2021/9/7 14:11
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EquipMent {
    private List<Connector> connectorList = new ArrayList<>();
}
