package annoIntroF.annoTarget;

import java.lang.annotation.*;

/**
 * 成员变量注解
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface FieldAnno {
    
}
