package annoIntroF.annoTarget;

import java.lang.annotation.*;

/**
 * 类注解
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@AnnotationTypeAnno
public @interface TypeAnno {
    
}
