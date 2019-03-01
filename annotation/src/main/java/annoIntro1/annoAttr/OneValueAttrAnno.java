package annoIntro1.annoAttr;

public @interface OneValueAttrAnno {

    String value() default "";

    String an() default "";
}
