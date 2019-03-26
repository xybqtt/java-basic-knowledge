package com.xyb;

import java.util.Date;

/**
 *
 * @author XYB
 * @create 2019/3/7
 * @since 1.0.0
 */
public class SomeOne implements IFTest{

    public final String a="JD";

    public static void main(String[] args) {
//        System.out.println("SomeOne：" + SomeOne.a);
//        System.out.println(Test2.a);
//        System.out.println(Test2.b);
//        System.out.println(Test3.c);
    }

    static {
        System.out.println("OK");
    }

}

class Test2{
    //加上static和final一起修饰 表示编译时常量，不依赖于类，不会触发静态块执行
    public static final String a="JD";
    public static final String b = a;
    static {
        System.out.println("OK");
    }

}

class Test3{
    public static final String c = Test2.a;
}
