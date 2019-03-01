package annoIntro1.annoTarget;

import java.lang.annotation.*;

/**
 * 构造方法注解
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.CONSTRUCTOR)
public @interface ConstructorAnno {
    
}
