package annoIntroF.annoTarget;

import java.lang.annotation.*;

/**
 * 方法(不包括构造方法)注解
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface MethodAnno {
    
}
