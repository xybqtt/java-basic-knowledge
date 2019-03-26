package staticProxy;

/**
 * 〈代理类，用于调用真正干活的类〉
 *
 * @author XYB
 * @create 2019/3/4
 * @since 1.0.0
 */
public class CinemaProxy implements Movie{

    private RealMovie realMovie;

    public CinemaProxy(RealMovie realMovie){
        this.realMovie = realMovie;
    }

    /**
     * 播放电影
     */
    @Override
    public void play() {
        playAd(true);
        realMovie.play();
        playAd(false);

    }

    /**
     * 播放广告
     */
    private void playAd(boolean flag){
        if(flag)
            System.out.println("放电影前，播放广告1");
        else
            System.out.println("放电影后，播放广告2");
    }
}