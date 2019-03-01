package annoIntro1.annoLevel;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈运行时注解〉
 *
 * @author XYB
 * @create 2019/3/1
 * @since 1.0.0
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeAnno {

    String value() default "sss";

    String my();
}