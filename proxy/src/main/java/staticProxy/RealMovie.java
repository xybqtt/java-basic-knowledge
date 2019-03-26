package staticProxy;

/**
 * 〈真正干活的类〉
 *
 * @author XYB
 * @create 2019/3/4
 * @since 1.0.0
 */
public class RealMovie implements Movie{

    /**
     * 播放电影
     */
    @Override
    public void play() {
        System.out.println("正在播放的时XXX电影！");
    }
}