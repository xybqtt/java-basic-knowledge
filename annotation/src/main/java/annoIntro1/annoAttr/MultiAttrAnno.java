package annoIntro1.annoAttr;


import java.lang.annotation.*;

/**
 * 多属性注解
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Inherited
@Target(ElementType.TYPE)
public @interface MultiAttrAnno {

    byte b();
    short s();
    float f();
    int i();
    double d();
    long l();
    boolean bo();
    char c();

    String st() default "5";
    String[] sts();

    Class cla();
    Class[] clas();







}
