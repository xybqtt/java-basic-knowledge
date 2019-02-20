package annoIntroF.annoTarget;

import java.lang.annotation.*;

/**
 * 用于类型参数，即泛型方法、泛型类、泛型接口
 */
@Documented
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE_PARAMETER)
public @interface TypeParameterAnno {
    
}
