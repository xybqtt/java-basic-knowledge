package annoIntro1.annoAttr;

import java.lang.annotation.*;

/**
 * 单属性注解
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface OneAttrAnno {

    String value() default "6";
}
