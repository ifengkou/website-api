package cn.analysys.test.common;

import cn.analysys.common.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description: {һ�仰�������Ǹ�ʲô��}
 *
 * @author shenlongguang
 * @version 1.0
 * @date: 2016/12/6 14:09
 */
public class StringUtilsTest {

    @Test
    public void test_notEmpty(){
        String str = "null";
        Assert.assertTrue(!StringUtils.notEmpty(str));
    }
}
