import java.lang.annotation.*;

/**
 * 〈第一个自定义注解〉
 *
 * @author XYB
 * @create 2019/2/14
 * @since 1.0.0
 */
//@Repeatable()
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Inherited
public @interface MyFirstAnno {

    /**
     * 一、 注解认识：注解如同标签，比如“幽默标签”贴在人身上会让别人觉得他是一个幽默的人，但是不论别人怎么
     * 认为，都改变不了此人的任何属性。
     *
     * 二、 注解介绍：
     *      1. 注解的属性也叫做成员变量。注解只有成员变量，没有方法。注解的成员变量在注解的定义中以“无形参的
     *      方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型。
     *      2. 赋值的方式是在注解的括号内以 value="" 形式，多个属性之前用 ，隔开。
     *      例如：@MyFirstAnno(name = "松鼠", age = 5)
     *      3. 注意的是，在注解中定义属性时它的类型必须是 8 种基本数据类型外加String、Class、及它们的数组。
     *      4. 注解中属性可以有默认值，默认值需要用 default 关键值指定。比如：String name() default "松鼠";
     *      5. 如果注解只有1个属性，且有默认值，则注解可以写成@MyFirstAnno。当属性名为value时，value可省略。
     *      6. 注解有几个属性，则必须写几个k = v。有默认值的不用写。
     *      7. 如果一个注解内仅仅只有一个名字为 value 的属性时，应用这个注解时可以直接接属性值填写到括号内。
     *      8. 如果注解没有属性，则后面()可以省略。类似@Override，标记注解。
     *
     * 二、 5个元注解(即注解的注解，用来注解注解)：
     *      1. @Documented：能够将注解中的元素包含到 Javadoc 中去。
     *      2. @Rentention()：注解的保留期，当此注解应用到一个注解上的时候，它解释说明了这个注解的的存活时间。
     *          它的取值如下：
     *              RetentionPolicy.SOURCE  注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。
     *              RetentionPolicy.CLASS  注解只被保留到编译进行的时候，它并不会被加载到 JVM 中。
     *              RetentionPolicy.RUNTIME  注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时
     *              可以获取到它们。
     *      3. @Target()：指定了注解运用的地方，当一个注解被 @Target 注解时，这个注解就被限定了运用的场景。
     *          @Target 有下面的取值：
     *              ElementType.ANNOTATION_TYPE  可以给一个注解进行注解
     *              ElementType.CONSTRUCTOR  可以给构造方法进行注解
     *              ElementType.FIELD  可以给属性进行注解
     *              ElementType.LOCAL_VARIABLE  可以给局部变量进行注解
     *              ElementType.METHOD   可以给方法进行注解
     *              ElementType.PACKAGE  可以给一个包进行注解
     *              ElementType.PARAMETER  可以给一个方法内的参数进行注解
     *              ElementType.TYPE  可以给一个类型进行注解，比如类、接口、枚举。
     *              ElementType.TYPE_PARAMETER 可以用于类型参数，即泛型方法、泛型类、泛型接口
     *              ElementType.TYPE_USE 可以给除了class和import的所有地方使用，主要用于第三方插件
     *      4. @Inherited：如果一个超类被 @Inherited 注解过的注解进行注解的话，那么如果它的子类没有被任何注解应用的话，
     *          那么这个子类就继承了超类的注解。
     *              (1) 类注解会被继承,子类有相同注解将覆盖父类注解,其他父类注解仍然继承
     *              (2) 子类从写方法,方法注解不会被继承
     *              (3) 接口上的注解不被继承
     *      5. @Repeatable()：@Repeatable 是 Java 1.8 才加进来的，所以算是一个新的特性。通常是注解的值可以同时取多个。
     *          举个例子，一个人他既是程序员又是产品经理,同时他还是个画家。
     *              (1) 可重复注解上的注解设置(@Target,@Retention,@Inherited...)需要是容器注解设置的子集,设置相同即可
     *      6. java预置注解：
     *          @Deprecated：编译器在编译阶段遇到这个注解时会发出提醒警告，告诉开发者正在调用一个过时的元素比如过时的
     *              方法、过时的类、过时的成员变量。
     *          @Override：提示子类要复写父类中被 @Override 修饰的方法
     *          @SuppressWarnings：阻止警告的意思。之前说过调用被 @Deprecated 注解的方法后，编译器会警告提醒，
     *              而有时候开发者会忽略这种警告，他们可以在调用的地方通过 @SuppressWarnings 达到目的。
     *          @SafeVarargs：参数安全类型注解。它的目的是提醒开发者不要用参数做一些不安全的操作,它的存在会阻止
     *              编译器产生 unchecked 这样的警告。它是在 Java 1.7 的版本中加入的。
     *      7. @FunctionalInterface：函数式接口注解，这个是 Java 1.8 版本引入的新特性。
     *
     *
     *
     */

    String name();

    int age();



}