package toString;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    String name;
    String sex;
    int age;

//    @Override
//    public String toString()
//    {
//        return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
//    }
}
