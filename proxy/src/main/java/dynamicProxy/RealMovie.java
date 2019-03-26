package dynamicProxy;

/**
 * 〈真正干活类〉
 *
 * @author XYB
 * @create 2019/3/4
 * @since 1.0.0
 */
public class RealMovie implements Movie{

    @Override
    public void play() {
        System.out.println("正在放的是XXXXXXXXX电影");
    }
}