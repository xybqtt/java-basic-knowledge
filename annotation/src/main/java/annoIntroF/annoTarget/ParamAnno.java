package annoIntroF.annoTarget;

import java.lang.annotation.*;

/**
 * 方法参数注解
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER)
public @interface ParamAnno {
    
}
