package annoIntro1.annoTarget;

import java.lang.annotation.*;

/**
 * 类型使用.可以用于标注任意类型除了 class(例如：@Anno String.class)和import(例如：import java.lang.@Anno Integer)
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE_USE)
public @interface TypeUserAnno {
    
}
