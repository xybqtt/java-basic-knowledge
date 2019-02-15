package annoIntroF.annoTarget;

import java.lang.annotation.*;

/**
 * 注解的注解，即写在被声明的注解的注解上，参考@Documented
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.ANNOTATION_TYPE)
public @interface AnnotationTypeAnno {
    
}
