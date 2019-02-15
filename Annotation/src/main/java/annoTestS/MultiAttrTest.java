/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MultiAttrTest
 * Author:   XYB
 * Date:     2019/2/14 19:15
 * Description: 多属性注解测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package annoTestS;

import annoIntroF.annoAttr.MultiAttrAnno;
import annoIntroF.annoAttr.NoAttrAnno;
import annoIntroF.annoAttr.OneAttrAnno;

/**
 * 〈一句话功能简述〉<br> 
 * 〈多属性注解测试〉
 *
 * @author XYB
 * @create 2019/2/14
 * @since 1.0.0
 */
@MultiAttrAnno(
        b = 'c', s = 1, f = 1.0f, i = 1, d = 1.0,
        l = 11, bo = false, c = 'c', sts = {"a", "b"},
        cla = String.class, clas = {String.class, Double.class}
)
public class MultiAttrTest {

}

// 注解单属性
@OneAttrAnno(value = "5")// 没有默认值必须写
class OneAttrTest {

}

@OneAttrAnno //有默认值可以不写
class OneAttrTest1 {

}

@OneAttrAnno("5") // 但当属性名为value，value可不写，为其它则必须写
class OneAttrTest2 {

}

// 注解无属性
@NoAttrAnno
class NoAttrTest {

}