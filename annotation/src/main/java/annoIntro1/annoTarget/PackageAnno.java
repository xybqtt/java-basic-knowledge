package annoIntro1.annoTarget;

import java.lang.annotation.*;

/**
 * 包注解，只能用在package-info.java文件中。
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PACKAGE)
public @interface PackageAnno {
    
}
