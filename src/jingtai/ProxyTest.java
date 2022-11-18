package jingtai;

public class ProxyTest {
    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();

        Cinema c = new Cinema(realMovie);

        c.play();

    }
}
