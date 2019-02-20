package annoIntroF.annoTarget;

import java.lang.annotation.*;

/**
 * 局部变量注解
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.LOCAL_VARIABLE)
public @interface LocalVarAnno {
    
}
