package jingTaiProxy;

public class RealMovie implements jingTaiProxy.Movie {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("您正在观看电影 《肖申克的救赎》");
    }

}