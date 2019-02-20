package annoIntroF.annoAttr;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 单属性注解
 */

@Documented
@Retention(RetentionPolicy.CLASS)
@Inherited
public @interface OneAttrAnno {

    String value() default "6";
}
