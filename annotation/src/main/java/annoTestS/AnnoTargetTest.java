/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AnnoTargetTest
 * Author:   XYB
 * Date:     2019/2/14 19:30
 * Description: target注解测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
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