import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class TestDTO {

    private Long id;

    private String param;

    private String parameter;
}