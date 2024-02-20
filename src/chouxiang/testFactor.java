package chouxiang;

import java.util.Date;
import java.util.Objects;

public class testFactor {
    public static void main(String[] args) {
        if(Objects.equals(null,0)){
            System.out.println(1);
        }
        Car car = CarFactor.carFactor(BMW.class);

        car.getCar();


    }
}
