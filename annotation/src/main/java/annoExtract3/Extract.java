package annoExtract3;

import annoIntro1.annoAttr.OneAttrAnno;
import annoIntro1.annoLevel.RuntimeAnno;
import annoTest2.MultiAttrTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 〈一句话功能简述〉<br> 
 * 〈提取注解的值〉
 *
 * @author XYB
 * @create 2019/3/1
 * @since 1.0.0
 */
@RuntimeAnno(my = "xyb")
public class Extract {

    @OneAttrAnno
    private String name;

    public static void main(String[] args) throws NoSuchFieldException {
        Annotation[] annotations = Extract.class.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation.toString());
        }
        System.out.println();
        RuntimeAnno runtimeAnno = Extract.class.getAnnotation(RuntimeAnno.class);
        System.out.println("注解值：" + runtimeAnno.value());
        System.out.println("注解值my：" + runtimeAnno.my());
        System.out.println();

        // 获取属性的注解
        Field field = Extract.class.getDeclaredField("name");
        field.setAccessible(true);
        OneAttrAnno oneAttrAnno = field.getAnnotation(OneAttrAnno.class);
        System.out.println("属性注解：" + oneAttrAnno.value());

        // 方法注解同理


    }

}