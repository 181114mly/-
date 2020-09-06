package util;

import org.junit.Assert;
import org.junit.Test;

public class DBUtilTest {
    @Test
    public void test(){
        //数据库连接对象不为空，即正确
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
