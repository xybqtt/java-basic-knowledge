package com.xyb;

import java.io.FileReader;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.security.cert.Extension;

public class XybClassLoader extends ClassLoader{

    public static void main(String[] args) {
//        WeakReference
        SoftReference softReference = new SoftReference(new Object());
        "".intern();
        SomeOne someOne = new SomeOne();
        System.out.println(someOne.getClass().getClassLoader());
        System.out.println(IFTest.class.getClassLoader());
        System.out.println(SomeOne.class.getSuperclass().getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(SomeOne.class.getClassLoader());
    }

}