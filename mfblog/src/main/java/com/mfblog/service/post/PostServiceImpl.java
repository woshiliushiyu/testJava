package com.mfblog.service.post;

import com.mfblog.dao.TestNewDao;
import com.mfblog.domain.PostCustom;
import com.mfblog.domain.TestNewUser;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


@Service("postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private TestNewDao testNewDao;

    @Override
    public void add(TestNewUser postCustom) throws Exception {

    }

    @Override
    public List<TestNewUser> findAll(int pageNum, int pageSize) {
        return testNewDao.findAll();
    }

    @Override
    public TestNewUser findOneById(Serializable id) throws NotFoundException {
        return null;
    }

    @Override
    public List<TestNewUser> findAllPublish(int pageNum, int pageSize) {

        return null;
    }

    @Override
    public int getPublishPostCount() {
        return 0;
    }

    @Override
    public int getAllPostCount() {
        return 0;
    }

    @Override
    public List<TestNewUser> findAllNew() {
        return null;
    }

    @Override
    public PostCustom findPostById(Serializable postId) {
        return null;
    }

    @Override
    public void update(PostCustom postBean) throws Exception {

    }

    @Override
    public void delOnePost(Serializable postBean) {

    }

    @Override
    public int getAllTrashCount() {
        return 0;
    }

    @Override
    public List<PostCustom> findAllTrash(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PostCustom findLastPostById(Integer postId) {
        return null;
    }
}
