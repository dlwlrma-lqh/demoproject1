import com.lqh.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestDemo {

    @Test
    public void test1(){
        SqlSessionFactory sqlSessionFactory = SqlSessionUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
    }
}
