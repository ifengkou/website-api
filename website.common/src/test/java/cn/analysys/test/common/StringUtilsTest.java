package cn.analysys.test.common;

import cn.analysys.common.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description: {一句话描述类是干什么的}
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
