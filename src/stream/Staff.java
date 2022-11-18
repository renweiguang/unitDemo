package stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff
{
    private String name;
    private Integer age;
    private BigDecimal salary;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public BigDecimal getSalary()
    {
        return salary;
    }

    public void setSalary(BigDecimal salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Staff(String name, int age, BigDecimal salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class StaffPublic
{
    private String name;
    private int age;
    private String extra;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getExtra()
    {
        return extra;
    }

    public void setExtra(String extra)
    {
        this.extra = extra;
    }

    @Override
    public String toString()
    {
        return "StaffPublic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", extra='" + extra + '\'' +
                '}';
    }

    // public StaffPublic(String name,int age,String extra){
    // this.name = name;
    // this.age = age;
    // this.extra = extra;
    // }
}
