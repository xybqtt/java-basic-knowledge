package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 〈的〉
 *
 * @author XYB
 * @create 2019/3/4
 * @since 1.0.0
 */
public class CinemaProxy implements InvocationHandler {

    private Object object;

    public CinemaProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("放电影前");
        method.invoke(this.object, args);
        System.out.println("放电影后");
        return null;
    }
}