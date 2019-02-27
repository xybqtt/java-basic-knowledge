package annoTestS;

import annoIntroF.annoTarget.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈target注解测试〉
 *
 * @author XYB
 * @create 2019/2/14
 * @since 1.0.0
 */
@TypeAnno
public class AnnoTargetTest<@TypeParameterAnno T> {

    @FieldAnno
    private String name;

    @FieldAnno
    private int age;

    @TypeUserAnno
    private T salary;

    @ConstructorAnno
    public AnnoTargetTest(){
        this(null, 0);
    }

    @ConstructorAnno
    public AnnoTargetTest(@ParamAnno String name, int age){

        @LocalVarAnno
        int i;


    }

    @MethodAnno
    public void add(){

    }
}