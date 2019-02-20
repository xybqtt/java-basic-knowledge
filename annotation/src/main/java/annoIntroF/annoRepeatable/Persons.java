package annoIntroF.annoRepeatable;

import java.lang.annotation.*;

/**
 * 容器注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Persons {
    //固定格式必须是使用 value()
    Person[] value();
}
