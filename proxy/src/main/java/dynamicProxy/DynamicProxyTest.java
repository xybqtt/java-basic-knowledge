package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *
 * @author XYB
 * @create 2019/3/4
 * @since 1.0.0
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();

        InvocationHandler invocationHandler = new CinemaProxy(realMovie);

        Movie movie = (Movie) Proxy.newProxyInstance(RealMovie.class.getClassLoader(), RealMovie.class.getInterfaces(), invocationHandler);

        movie.play();
    }

}