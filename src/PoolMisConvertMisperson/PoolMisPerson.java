package PoolMisConvertMisperson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoolMisPerson
{
    private String name;
    private int age;
    private String pwd;

    public void fromMisPersonObj(MisPerson obj)
    {
        this.age = obj.getAge();
        this.name = obj.getName();
        this.pwd = obj.getPwd();
    }

}
