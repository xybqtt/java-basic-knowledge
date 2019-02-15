package reflectUse;

import bean.Person;

/**
 * 反射用法
 */
public class ReflectUsage {

    public static void main(String[] args) {
        ReflectUsage reflectUsage = new ReflectUsage();
        reflectUsage.useReflect();
    }

    public void useReflect(){
        Person person = new Person();

        Class cls = getClass(person);
    }

    /**
     * 三种方式获得对象的class
     * @param object
     * @return
     */
    public Class getClass(Object object){
        Class cls;

        // 方法一
        cls = object.getClass();
        System.out.println(cls.getCanonicalName());
        return cls;

        // 方法二 此方法获取的是Object
//        cls = Object.class;
//        System.out.println(cls.getCanonicalName());
//        return cls;

        // 方法三
//        try {
//            cls = Class.forName("bean.Person");
//            System.out.println(cls.getCanonicalName());
//            return cls;
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            return null;
//        }
    }





}
