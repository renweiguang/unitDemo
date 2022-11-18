package reflect;

import java.lang.reflect.Field;

class Dog {
    private String color;

    public String getColor() {
        return color;
    }

//    public void setColor(String color) {
//      this.color = color;
//    }
}

public class BaoLiFanShe {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        // 如何给私有的只读的成员变量赋值
        Class<Dog> dogClass = Dog.class;
        // 调用无参构造方法 new一个实例
        Dog dog = dogClass.newInstance();

        Field color = dogClass.getDeclaredField("color");

        color.setAccessible(true);

        color.set(dog,"red");


        System.out.println(dog.getColor());

    }
}
