package cn.test.post;

import com.mfblog.dao.PostDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestPost extends BaseTest {

    @Autowired
    private PostDao postDao;

    @Test
    public void testPost(){

//        List<PostCustom> list = postDao.findAllPublish(1,20);
//
//        for (PostCustom postCustom : list){
//
//            System.out.println("打印结果"+postCustom.toString());
//        }

    }


}
