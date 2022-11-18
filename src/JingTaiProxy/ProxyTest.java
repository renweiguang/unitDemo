package jingTaiProxy;

public class ProxyTest
{

    public static void main(String[] args)
    {

        jingTaiProxy.RealMovie realmovie = new jingTaiProxy.RealMovie();

        jingTaiProxy.Movie movie = new jingTaiProxy.Cinema(realmovie);

        movie.play();

    }
}