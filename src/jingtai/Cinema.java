package jingtai;

public class Cinema implements Movie {
    RealMovie m;

    public Cinema(RealMovie m) {
        this.m = m;
    }

    @Override
    public void play() {

        guanggao(true);
        m.play();
        guanggao(true);

    }

    public void guanggao(boolean isStart) {
        if (isStart) {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
        } else {
            System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！");
        }
    }
}
