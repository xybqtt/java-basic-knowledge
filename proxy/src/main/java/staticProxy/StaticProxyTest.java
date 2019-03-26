package staticProxy;

/**
 * 〈测试静态代理类〉
 *
 * @author XYB
 * @create 2019/3/4
 * @since 1.0.0
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        // 真正干活的类
        RealMovie realMovie = new RealMovie();

        // movie是面向顾客的接口，即顾客只用调用这个接口，就得到想要的东西
        // CinemaProxy是代理类，代理真正干活的类，并根据需要自己添加额外的内容，比
        // 如电影公司让影院放电影，但是影院自己在放电影前后加广告。
        Movie movie = new CinemaProxy(realMovie);

        // 顾客调用接口方法
        movie.play();
    }

}