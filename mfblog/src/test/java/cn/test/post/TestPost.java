package cn.test.post;

import com.mfblog.dao.PostDao;
import com.mfblog.dao.TestNewDao;
import com.mfblog.domain.TestNewUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.List;


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

        TestNewUser tes = new TestNewUser("张三","北京","男", id);

        testNewDao.add(tes);

    }

    @Test
    public void  testdel(){

        TestNewUser tes = new TestNewUser("张三","","", id);

        testNewDao.del(tes);
    }

    @Test
    public void testSelect(){

        List<TestNewUser> list =  testNewDao.findAll();

        for (TestNewUser testNewUser : list){

            System.out.println("获取数据"+testNewUser.toString());
        }
    }

    @Test
    public void testOne(){

        File file = new File("HelloWorld.java");
        String fileName = file.getName();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println(suffix);
    }

    @Test
    public void testHttpclite(){


    }



}
