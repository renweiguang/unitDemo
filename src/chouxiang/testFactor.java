package chouxiang;

public class testFactor {
    public static void main(String[] args) {
        Car car = CarFactor.carFactor(BMW.class);

        car.getCar();
    }
}
