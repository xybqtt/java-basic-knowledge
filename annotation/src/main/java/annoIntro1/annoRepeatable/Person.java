package annoIntro1.annoRepeatable;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})//容器注解的设置要大于可重复注解的设置
@Repeatable(Persons.class)
public @interface Person {
    String role() default "";
}
