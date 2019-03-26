package com.xyb;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class ReferenceTest {
    public static class User {
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int id;
        public String name;

        @Override
        public String toString() {
            return "User [id=" + id + ", name=" + name + "]";
        }
    }

    static ReferenceQueue<User> softQueue = null;

    public static class CheckRefQueue extends Thread {
        @Override
        public void run() {
            //跟踪引用队列
            while (true) {
                if (softQueue != null) {
                    UserSoftReference obj = null;
                    try {
                        obj = (UserSoftReference) softQueue.remove();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (obj != null) {
                        System.out.println("user id" + obj.uid + " is delete");
                    }
                }
            }
        }
    }

    //实现自定义软引用类，扩展软引用的目的是记录User.uid,在后续引用队列中，可以通过这个uid知道哪个User实例被回收了
    public static class UserSoftReference extends SoftReference<User> {
        int uid;

        public UserSoftReference(User referent, ReferenceQueue<? super User> q) {
            super(referent, q);
            uid = referent.id;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new CheckRefQueue();
        t.setDaemon(true);
        t.start();
        User u = new User(1, "geym");//建立user实例，强引用
        softQueue = new ReferenceQueue<User>();//通过强引用，建立软引用
        //创建软引用时，指定了一个软引用队列，当给定的对象实例被回收时，就会被加入这个引用队列，通过访问该队列可以跟踪对象的回收情况
        UserSoftReference userSoftRef = new UserSoftReference(u, softQueue);
        u = null;//去除强引用
        System.out.println(userSoftRef.get());//从软引用获取强引用对象
        System.gc();//垃圾回收
        //内存足够，不会被回收
        System.out.println("After GC:");
        System.out.println(userSoftRef.get());//再次获取软引用中的对象
        System.out.println("xyb：" + softQueue);
        System.out.println("try to create byte array and GC");
        byte[] b = new byte[1024 * 930 * 7];//分配一块大内存，让系统认为内存紧张
        System.gc();//垃圾回收
        System.out.println(userSoftRef.get());//从软引用获取数据
        Thread.sleep(1000);
    }

}