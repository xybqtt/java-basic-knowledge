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

    String name();

    int age();



}