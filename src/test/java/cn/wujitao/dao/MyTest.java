package cn.wujitao.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save();
        System.out.println(userDao);

    }
}
