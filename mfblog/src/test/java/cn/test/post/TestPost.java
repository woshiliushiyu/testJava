package cn.test.post;

import com.mfblog.dao.PostDao;
import com.mfblog.dao.TestNewDao;
import com.mfblog.domain.TestNewUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestPost extends BaseTest {

    @Autowired
    private PostDao postDao;

    @Autowired
    private TestNewDao testNewDao;

    @Test
    public void testPost(){

//        List<PostCustom> list = postDao.findAllPublish(1,20);
//
//        for (PostCustom postCustom : list){
//
//            System.out.println("打印结果"+postCustom.toString());
//        }

        TestNewUser tes = new TestNewUser("张三","北京","男");

        testNewDao.add(tes);

    }

    @Test
    public void  testdel(){

        TestNewUser tes = new TestNewUser("张三","","");

        testNewDao.del(tes);
    }


}
