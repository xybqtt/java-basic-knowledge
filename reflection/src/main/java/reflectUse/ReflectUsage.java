package reflectUse;

import bean.Parent;
import bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射用法
 */
public class ReflectUsage {

    public static void main(String[] args) {
        ReflectUsage reflectUsage = new ReflectUsage();
        try {
            reflectUsage.useReflect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useReflect() throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Person person = new Person();
        Class cls = getMyClass(person);
        System.out.println("类名：" + cls.getName());

        // 属性信息
        printFieldInfo(cls);

        // 方法信息
        printMethodInfo(cls);

        // 构造方法信息
        printConstructorInfo(cls);

        // 注解用法，查看注解模块。

        // 设置属性的值
        setPrivateField(cls);

        // 反射调用方法
        invokeMethods(cls);

        // 获取父类信息
        printSuperFields(cls);

        // 获取classloader，当由启动类装载器装载时，返回null
        ClassLoader classLoader = cls.getClassLoader();
        System.out.println(classLoader);


    }

    private void invokeMethods(Class cls) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Person person = (Person) cls.newInstance();
        Method method = cls.getMethod("setName", String.class);
        method.invoke(person, "xybb");
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("反射调用方法设置name后的值：" + field.get(person));
        System.out.println();

    }

    private void setPrivateField(Class cls) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Person person1 = (Person) cls.newInstance();
        person1.setName("xyb");
        Field field = cls.getDeclaredField("name");
        // 设置为true，则可以更改私有属性的值，为false则不可。
        field.setAccessible(true);
        System.out.println("原来private name的值：" + field.get(person1));
        field.set(person1, "xyb2");
        System.out.println("修改后的private name的值：" + field.get(person1));
    }

    private void printConstructorInfo(Class cls) throws NoSuchMethodException {
        printPublicConstruc(cls);
        printAllConstruc(cls);
        System.out.println("根据方法名和参数获取public构造方法：" + cls.getConstructor().toString());
        System.out.println("根据方法名和参数获取private构造方法：" + cls.getDeclaredConstructor(String.class).toString());
        System.out.println("可以用getMethods获取构造方法");
        System.out.println();
    }

    private void printMethodInfo(Class cls) throws NoSuchMethodException {
        printPublicMethods(cls);
        printAllMethods(cls);
        System.out.println("根据方法名和参数获取public方法：" + cls.getMethod("setAge", int.class, String.class).toString());
        System.out.println("根据方法名和参数获取私有方法：" + cls.getDeclaredMethod("testPrivate").toString());
        System.out.println();
    }

    private void printFieldInfo(Class cls) throws NoSuchFieldException {
        printPublicFields(cls);
        printAllFields(cls);
        System.out.println("根据属性名获取public属性：" + cls.getField("age").toString());
        System.out.println("根据属性名获取私有属性：" + cls.getDeclaredField("name").toString());
        System.out.println();
    }

    private void printSuperFields(Class cls) throws IllegalAccessException, InstantiationException {
        Class parentcls = cls.getSuperclass();
        Parent parent = (Parent) parentcls.newInstance();
        Field[] pFileds = parentcls.getDeclaredFields();
        for(int i = 0; i < pFileds.length; i++){
            System.out.println(pFileds[i]);
        }
    }

    /**
     * 打印所有public构造方法
     * @param cls
     */
    private void printAllConstruc(Class cls){
        Constructor[] constructors = cls.getDeclaredConstructors();
        System.out.println("输出所有构造方法信息：");
        int i = 1;
        for(Constructor constructor : constructors){
            System.out.println("    构造方法" + i + "：" + constructor.toString());
        }
    }

    /**
     * 打印所有public构造方法
     * @param cls
     */
    private void printPublicConstruc(Class cls){
        Constructor[] constructors = cls.getConstructors();
        System.out.println("输出所有public构造方法信息：");
        int i = 1;
        for(Constructor constructor : constructors){
            System.out.println("    构造方法" + i + "：" + constructor.toString());
        }
    }

    /**
     * 打印所有public方法
     * @param cls
     */
    private void printAllMethods(Class cls){
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("输出所有方法信息(但是不包括父类私有)：");
        int i = 1;
        for(Method method : methods){
            System.out.println("    方法" + i + "：" + method.toString());
        }
    }

    /**
     * 打印所有public方法
     * @param cls
     */
    private void printPublicMethods(Class cls){
        Method[] methods = cls.getMethods();
        System.out.println("输出所有public方法信息(包括父类，爷爷类)：");
        int i = 1;
        for(Method method : methods){
            System.out.println("    方法" + i + "：" + method.toString());
        }
    }

    /**
     * 打印所有属性，包括私有的
     */
    private void printAllFields(Class cls) {

        Field[] fields = cls.getDeclaredFields();
        int i = 1;
        System.out.println("输出所有属性，包括私有的(但是不包括父类私有)：");
        for (Field field : fields)
            System.out.println("    属性" + i + "：" + field.toString());
    }


    /**
     * 得到类的public属性
     *
     * @param cls
     */
    private void printPublicFields(Class cls) {
        Field[] fields = cls.getFields();
        System.out.println("输出所有public属性信息(包括父类public属性)：");
        int i = 1;
        for (Field field : fields) {
            System.out.println("    属性" + i + "：" + field.toString());
        }
    }

    /**
     * 三种方式获得对象的class
     *
     * @param object
     * @return
     */
    public Class getMyClass(Object object) {

        // 方法一
        Class cls = object.getClass();
        System.out.println();
        return cls;

        // 方法二 此方法获取的是Object
//        Class cls = Object.class;
//        System.out.println(cls.getCanonicalName());
//        return cls;

        // 方法三
//        try {
//            Class cls = Class.forName("bean.Person");
//            System.out.println(cls.getCanonicalName());
//            return cls;
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            return null;
//        }
    }


}
