package fastJsonAndJsonField;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @JSONField 就是给指定的json起个名字。。。
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
public class People implements Serializable
{

    private static final long serialVersionUID = -874758492035405289L;

    @JSONField(name = "xxx")
    private int id;
    @JSONField(name = "yyy")
    private String name;

    private String sex;

    private int age;

    private Date birthday;

}
