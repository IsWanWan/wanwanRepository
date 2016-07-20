package test;


import com.my.pojo.Admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by wanwan on 16/7/17.
 */
public class FirstMybatis {

  private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init(){
        try {
          //  InputStream inputStream = Resources.getResourceAsStream("spring/mybatisConfig.xml");

            // 配置文件（SqlMapConfig.xml）
            String resource = "spring/mybatisConfig.xml";

            // 加载配置文件到输入 流
            InputStream inputStream = Resources.getResourceAsStream(resource);

          sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testFind(){
        // 通过sqlSessionFactory创建sqlSession

        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 通过sqlSession操作数据库
        // 第一个参数：statement的位置，等于namespace+statement的id
        // 第二个参数：传入的参数
        Admin user = null;
        try {
            user = sqlSession.selectOne("one.find", 1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭sqlSession
            sqlSession.close();
        }

        System.out.println(user.getName() +" :" + user.getPassword());

      // System.out.println(" admin :"+ admin.getName() +" : "+ admin.getPassword());

    }
}
