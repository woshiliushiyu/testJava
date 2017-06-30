package com.mfblog.service.post;

import com.mfblog.dao.PostDao;
import com.mfblog.domain.PostCustom;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


@Service("postService")
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;

    @Override
    public void add(PostCustom postCustom) throws Exception {

        postDao.add(postCustom);
    }

    @Override
    public List<PostCustom> findAll(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PostCustom findOneById(Serializable id) throws NotFoundException {
        return null;
    }

    @Override
    public List<PostCustom> findAllPublish(int pageNum, int pageSize) {

        return postDao.findAllPublish(pageNum,pageSize);
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
    public List<PostCustom> findAllNew() {
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
